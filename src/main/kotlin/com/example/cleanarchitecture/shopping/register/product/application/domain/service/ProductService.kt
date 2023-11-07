package com.example.cleanarchitecture.shopping.register.product.application.domain.service

import com.example.cleanarchitecture.shopping.register.option.application.domain.model.Option
import com.example.cleanarchitecture.shopping.register.option.application.port.`in`.RegisterProductOptionUseCase
import com.example.cleanarchitecture.shopping.register.product.application.port.out.RegisterProductPort

class ProductService(
    private val registerProductPort: RegisterProductPort
) : RegisterProductOptionUseCase {
    override fun registerProductOption(option: Option) {
        TODO("Not yet implemented")
    }
}