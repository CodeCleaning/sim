package com.example.cleanarchitecture.chapter3.srp.version2.report

import com.example.cleanarchitecture.chapter3.srp.version1.Employee

interface ReportHoursUseCase {
    fun reportHours(employeeId: Employee)
}