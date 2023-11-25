package com.example.cleanarchitecture.shopping.product.application.port.out

import com.example.cleanarchitecture.shopping.register.product.application.domain.model.Option

interface RegisterProductOptionPort {
    fun registerProductOption(option: Option): Option
}