package com.example.cleanarchitecture.chapter3.ocp.core.service

import com.example.cleanarchitecture.chapter3.ocp.core.model.FinancialData

// 의존성의 역전을 위한 Interface, 비즈니스 로직을 외부 변경으로부터 보호한다
interface FinancialDataRepository {
    fun findFinancialDataBySomething() : FinancialData
}