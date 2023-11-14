package com.example.cleanarchitecture.chapter3.srp.version1

data class Employee(
    val id: Long,
    val name: String,
    val payOfHour: Long
)

data class MonthOfficeHour(
    val employeeId: Employee? = null,
    val month: Int = 1,
    val officeHourOfMonth: Int = 1,
    val dayOfOfficeHours: List<DayOfficeHour> = listOf()
) {
    data class DayOfficeHour(
        val day: Int,
        val officeHour: String
    )
}

