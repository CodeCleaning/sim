package com.example.cleanarchitecture.chapter3.ocp.controller

import com.example.cleanarchitecture.chapter3.ocp.core.model.FinancialReport
import com.example.cleanarchitecture.chapter3.ocp.core.service.FinancialReportService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FinancialReportController(
    private val financialReportService: FinancialReportService
) {
    @GetMapping("/")
    fun getFinancialReport(): Response {
        val financialReport = financialReportService.getFinancialReport()
        return Response(
            financialReport
        )
    }

    data class Response(
        val something: String
    ) {
        constructor(financialReport: FinancialReport) : this(
            financialReport.analyzedSomething
        )
    }
}
