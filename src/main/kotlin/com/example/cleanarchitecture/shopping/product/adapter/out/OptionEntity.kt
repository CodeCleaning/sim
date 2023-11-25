package com.example.cleanarchitecture.shopping.product.adapter.out

import com.example.cleanarchitecture.shopping.product.adapter.`in`.RegisterProductWebAdapter
import com.example.cleanarchitecture.shopping.register.product.application.domain.model.ProductState
import com.fasterxml.jackson.databind.BeanDescription

// @Entity
class OptionEntity(
    // @Id
    var id: String,
    var name: String,
    var categoryId: Long,
    var price: Long,
    var type: ProductState,
    var description: String,
    // @OneToMany(FetchType.ALL)
    var optionDetails: List<OptionDetailEntity>
)

// @Entity
class OptionDetailEntity(
    var id: String,
    var detail: String,
    var price: Long
)
