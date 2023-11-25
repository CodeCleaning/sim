package com.example.cleanarchitecture.shopping.product.application.port.`in`

import com.example.cleanarchitecture.shopping.register.product.application.domain.model.Option

interface RegisterProductOptionUseCase {
    fun registerProductOption(option: Option): Option
}