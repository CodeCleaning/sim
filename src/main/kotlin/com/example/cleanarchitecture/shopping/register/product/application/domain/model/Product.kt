package com.example.cleanarchitecture.shopping.register.product.application.domain.model

data class Product(
    val id: Long = 0L,
    val name: String,
    val categoryId: Long,
    val price: Long = 0L,
    val type: ProductState = ProductState.REGISTER,
    val description: String = "",
    val option: List<Option> = listOf()
)