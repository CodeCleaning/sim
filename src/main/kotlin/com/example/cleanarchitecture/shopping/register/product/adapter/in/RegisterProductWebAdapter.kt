package com.example.cleanarchitecture.shopping.register.product.adapter.`in`

import com.example.cleanarchitecture.shopping.admin.category.application.port.`in`.CreateCategoryUseCase
import com.example.cleanarchitecture.shopping.register.product.application.domain.model.Product
import com.example.cleanarchitecture.shopping.register.product.application.port.`in`.RegisterProductUseCase

class RegisterProductWebAdapter(
    private val registerProductUseCase: RegisterProductUseCase,
    private val registerOptionUseCase: CreateCategoryUseCase
) {
    fun registerProduct(
        registerProductRequest: RegisterProductRequest
    ) {
        registerProductUseCase.registerProduct(
            Product(
                name = registerProductRequest.name,
                categoryId = registerProductRequest.categoryId,
                price = registerProductRequest.price,
                description = registerProductRequest.description
            )
        )
    }

    data class RegisterProductRequest(
        val name: String,
        val categoryId: Long,
        val price: Long,
        val description: String
    )
}
