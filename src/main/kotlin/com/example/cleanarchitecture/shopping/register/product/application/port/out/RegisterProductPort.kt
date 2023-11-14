package com.example.cleanarchitecture.shopping.register.product.application.port.out

import com.example.cleanarchitecture.shopping.register.product.application.domain.model.Product

interface RegisterProductPort {
    fun registerProduct(product: Product)
}