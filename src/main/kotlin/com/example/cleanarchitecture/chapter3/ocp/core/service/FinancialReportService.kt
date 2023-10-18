package com.example.cleanarchitecture.chapter3.ocp.core.service

import com.example.cleanarchitecture.chapter3.ocp.core.model.FinancialReport

interface FinancialReportService {
    fun getFinancialReport(): FinancialReport
}