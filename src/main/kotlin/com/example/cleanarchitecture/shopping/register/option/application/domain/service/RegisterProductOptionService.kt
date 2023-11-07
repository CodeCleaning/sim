package com.example.cleanarchitecture.shopping.register.option.application.domain.service

import com.example.cleanarchitecture.shopping.product.application.domain.model.Option
import com.example.cleanarchitecture.shopping.register.option.application.port.`in`.RegisterProductOptionUseCase
import com.example.cleanarchitecture.shopping.register.option.application.port.out.RegisterProductOptionPort

class RegisterProductOptionService(
    private val registerProductOptionPort: RegisterProductOptionPort
) : RegisterProductOptionUseCase {
    override fun registerProductOption(option: Option) {
        registerProductOptionPort.registerProductOption(option)
    }
}