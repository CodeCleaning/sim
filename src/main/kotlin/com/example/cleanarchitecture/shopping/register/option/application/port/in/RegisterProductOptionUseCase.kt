package com.example.cleanarchitecture.shopping.register.option.application.port.`in`

import com.example.cleanarchitecture.shopping.product.application.domain.model.Option

interface RegisterProductOptionUseCase {
    fun registerProductOption(option: Option)
}