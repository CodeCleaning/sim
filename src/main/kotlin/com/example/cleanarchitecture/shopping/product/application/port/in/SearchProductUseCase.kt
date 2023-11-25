package com.example.cleanarchitecture.shopping.product.application.port.`in`

import com.example.cleanarchitecture.shopping.register.product.application.domain.model.Product

interface SearchProductUseCase {
    fun searchProduct(searchProductCommand: SearchProductCommand): List<Product>
}

data class SearchProductCommand(
    val categoryId: Long,
    val order: String
)