package com.example.cleanarchitecture.shopping.product.application.domain.service

import com.example.cleanarchitecture.shopping.register.product.application.domain.model.Option
import com.example.cleanarchitecture.shopping.register.product.application.port.`in`.RegisterProductOptionUseCase
import com.example.cleanarchitecture.shopping.register.product.application.port.out.RegisterProductOptionPort
import org.springframework.stereotype.Service

@Service
class RegisterProductOptionService(
    private val registerProductOptionPort: RegisterProductOptionPort
) : RegisterProductOptionUseCase {
    override fun registerProductOption(option: Option): Option {
        return registerProductOptionPort.registerProductOption(option)
    }
}