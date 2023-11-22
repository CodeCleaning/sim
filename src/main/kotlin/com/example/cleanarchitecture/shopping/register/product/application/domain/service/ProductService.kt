package com.example.cleanarchitecture.shopping.register.product.application.domain.service

import com.example.cleanarchitecture.shopping.register.option.application.domain.model.Option
import com.example.cleanarchitecture.shopping.register.option.application.port.`in`.RegisterProductOptionUseCase
import com.example.cleanarchitecture.shopping.register.product.application.domain.model.Product
import com.example.cleanarchitecture.shopping.register.product.application.port.`in`.RegisterProductUseCase
import com.example.cleanarchitecture.shopping.register.product.application.port.`in`.SearchProductCommand
import com.example.cleanarchitecture.shopping.register.product.application.port.`in`.SearchProductUseCase
import com.example.cleanarchitecture.shopping.register.product.application.port.out.RegisterProductPort

class ProductService(
    private val registerProductPort: RegisterProductPort
) : RegisterProductUseCase,
    SearchProductUseCase {
    override fun registerProduct(product: Product) {
        TODO("Not yet implemented")
    }

    override fun searchProduct(searchProductCommand: SearchProductCommand): List<Product> {
        TODO("Not yet implemented")
    }
}