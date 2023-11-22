package com.example.cleanarchitecture.shopping.register.product.application.port.`in`

import com.example.cleanarchitecture.shopping.register.product.application.domain.model.Product

interface RegisterProductUseCase {
    fun registerProduct(product: Product)
}