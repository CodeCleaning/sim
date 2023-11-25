package com.example.cleanarchitecture.shopping.product.application.domain.model

import java.lang.RuntimeException

data class Product(
    val id: Long = 0L,
    val name: String,
    val categoryId: Long,
    val price: Long = 0L,
    val type: ProductState = ProductState.REGISTER,
    val description: String = ""
) {
    init {
        if (price < 0) {
            throw RuntimeException()
        }

        if (name.length > 50) {
            throw RuntimeException()
        }
    }
}