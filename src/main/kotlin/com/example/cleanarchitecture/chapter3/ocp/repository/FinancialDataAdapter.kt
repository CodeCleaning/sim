package com.example.cleanarchitecture.chapter3.ocp.repository

import com.example.cleanarchitecture.chapter3.ocp.core.domain.FinancialData
import com.example.cleanarchitecture.chapter3.ocp.core.service.FinancialDataRepository
import org.springframework.stereotype.Repository

@Repository
class FinancialDataAdapter : FinancialDataRepository {
    override fun findFinancialDataBySomething(): FinancialData {
        val financialDataEntity = FinancialDataEntity("something")
        return financialDataEntity.toDto()
    }
}