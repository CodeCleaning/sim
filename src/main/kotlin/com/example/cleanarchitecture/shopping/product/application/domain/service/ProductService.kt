package com.example.cleanarchitecture.shopping.product.application.domain.service

import com.example.cleanarchitecture.shopping.register.product.application.domain.model.Product
import com.example.cleanarchitecture.shopping.register.product.application.port.`in`.RegisterProductUseCase
import com.example.cleanarchitecture.shopping.register.product.application.port.`in`.SearchProductCommand
import com.example.cleanarchitecture.shopping.register.product.application.port.`in`.SearchProductUseCase
import com.example.cleanarchitecture.shopping.register.product.application.port.out.RegisterProductPort
import org.springframework.stereotype.Service

@Service
class ProductService(
    private val registerProductPort: RegisterProductPort
) : RegisterProductUseCase,
    SearchProductUseCase {

    override fun registerProduct(product: Product): Product {
        return registerProductPort.registerProduct(product)
    }

    override fun searchProduct(searchProductCommand: SearchProductCommand): List<Product> {
        TODO("Not yet implemented")
    }
}