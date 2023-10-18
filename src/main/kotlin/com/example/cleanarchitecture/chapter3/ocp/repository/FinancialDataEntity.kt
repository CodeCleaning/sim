package com.example.cleanarchitecture.chapter3.ocp.repository

import com.example.cleanarchitecture.chapter3.ocp.core.model.FinancialData

// entity
class FinancialDataEntity(
    private val something: String
) {
    fun toDto() : FinancialData {
        return FinancialData(something)
    }
}