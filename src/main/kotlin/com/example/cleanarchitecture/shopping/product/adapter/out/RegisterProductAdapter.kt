package com.example.cleanarchitecture.shopping.product.adapter.out

import com.example.cleanarchitecture.shopping.product.application.domain.model.Product
import com.example.cleanarchitecture.shopping.product.application.port.out.RegisterProductPort
import org.springframework.stereotype.Component

@Component
class RegisterProductAdapter(
    private val productRepository: ProductRepository
) : RegisterProductPort {
    override fun registerProduct(product: Product): Product {
//        productRepository.save(
//
//        )

        return product
    }
}