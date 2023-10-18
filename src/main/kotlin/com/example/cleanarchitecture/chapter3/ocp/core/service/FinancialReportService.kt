package com.example.cleanarchitecture.chapter3.ocp.core.service

import com.example.cleanarchitecture.chapter3.ocp.core.model.FinancialReport

// 은닉성을 위한 interface 외부로부터 세부적인 구현을 숨긴다
interface FinancialReportService {
    fun getFinancialReport(): FinancialReport
}