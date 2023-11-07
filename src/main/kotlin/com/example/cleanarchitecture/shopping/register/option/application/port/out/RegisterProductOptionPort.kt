package com.example.cleanarchitecture.shopping.register.option.application.port.out

import com.example.cleanarchitecture.shopping.product.application.domain.model.Option

interface RegisterProductOptionPort {
    fun registerProductOption(option: Option)
}