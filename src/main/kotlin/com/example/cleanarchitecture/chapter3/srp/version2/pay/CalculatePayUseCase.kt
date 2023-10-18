package com.example.cleanarchitecture.chapter3.srp.version2.pay

interface CalculatePayUseCase {
    fun calculatePay(employeeId: Long): Long
}