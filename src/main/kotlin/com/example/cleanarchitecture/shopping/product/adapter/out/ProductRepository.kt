package com.example.cleanarchitecture.shopping.product.adapter.out

import org.springframework.stereotype.Component

@Component
interface ProductRepository {
    fun save(productEntity: ProductEntity): ProductEntity
}