package com.example.cleanarchitecture.shopping.product.adapter.out

import org.springframework.stereotype.Component

@Component
interface OptionRepository {
    fun save(optionEntity: OptionEntity): OptionEntity
}