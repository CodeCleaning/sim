package com.example.cleanarchitecture.chapter3.ocp.core.service

import com.example.cleanarchitecture.chapter3.ocp.core.model.FinancialData

interface FinancialDataRepository {
    fun findFinancialDataBySomething() : FinancialData
}