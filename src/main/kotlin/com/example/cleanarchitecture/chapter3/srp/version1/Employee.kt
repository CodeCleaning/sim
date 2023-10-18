package com.example.cleanarchitecture.chapter3.srp.version1

data class Employee(
    val id: Long,
    val name: String,
    val payOfHour: Long
)

data class MonthOfficeHour(
    val employeeId: Employee,
    val month: Int,
    val officeHourOfMonth: Int,
    val dayOfOfficeHours: List<DayOfficeHour>
) {
    data class DayOfficeHour(
        val day: Int,
        val officeHour: String
    )
}

