package com.example.cleanarchitecture.chapter3.ocp.core.service

import com.example.cleanarchitecture.chapter3.ocp.core.model.FinancialData
import com.example.cleanarchitecture.chapter3.ocp.core.model.FinancialReport
import org.springframework.stereotype.Service

@Service
class FinancialReportServiceImpl(
    private val financialDataRepository: FinancialDataRepository
) : FinancialReportService {

    override fun getFinancialReport(): FinancialReport {
        val financialData = financialDataRepository.findFinancialDataBySomething()
        return analyzeFinancialReport(financialData)
    }

    private fun analyzeFinancialReport(financialData: FinancialData): FinancialReport {
        return FinancialReport(financialData.something)
    }
}