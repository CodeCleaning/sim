package com.example.cleanarchitecture.chapter3.srp.version1

/**
 * Monolithic Employee
 * calculatePay 메서드와 reportHours 메서드가 calculateRegularHour 메서드를 공유
 * calculatePay 의 사정에 의해 calculateRegularHour 가 변경될 경우 reportHours 에도 영향을 미친다
**/
class EmployeePayService {

    private val maxOfficeHour = 200

    // 직원 급여 계산 메서드, for CFO
    fun calculatePay(
        employeeId: Long,
        month: Int
    ): Int {
        val employee: Employee // 조회 가정
        val monthOfficeHour = MonthOfficeHour() // 조회 가정

        val regularPay = calculateRegularHour(monthOfficeHour.officeHourOfMonth)
        val overPay = calculateExtraHour(monthOfficeHour.officeHourOfMonth)

        return regularPay + overPay
    }

    // 이번 달 직원 업무시간과 초과 근무 시간 반환 메서드, for COO
    fun reportHours(
        employeeId: Long,
        month: Int
    ): EmployMonthOfficeHourResponse? {
        val employee: Employee = Employee(1, "asd", 1) // 조회 가정
        val monthOfficeHour = MonthOfficeHour() // 조회 가정

        return EmployMonthOfficeHourResponse(
            employee.name,
            calculateRegularHour(monthOfficeHour.officeHourOfMonth),
            calculateExtraHour(monthOfficeHour.officeHourOfMonth)
        )
    }

    private fun calculateRegularHour(monthOfOfficeHour: Int): Int {
        return if(monthOfOfficeHour <= maxOfficeHour) {
            monthOfOfficeHour
        } else {
            monthOfOfficeHour - maxOfficeHour
        }
    }

    private fun calculateExtraHour(monthOfOfficeHour: Int): Int {
        return if(monthOfOfficeHour <= maxOfficeHour) {
            0
        } else {
            maxOfficeHour - monthOfOfficeHour
        }
    }

    // ??
    fun save() {}

    data class EmployMonthOfficeHourResponse(
        val employeeName: String,
        val workOfficeHour: Int,
        val overOfficeHour: Int
    )
}
