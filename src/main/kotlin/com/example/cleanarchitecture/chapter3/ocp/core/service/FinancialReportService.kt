package com.example.cleanarchitecture.chapter3.ocp.core.service

import com.example.cleanarchitecture.chapter3.ocp.core.domain.FinancialReport

interface FinancialReportService {
    fun getFinancialReport(): FinancialReport
}