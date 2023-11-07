package com.example.cleanarchitecture.shopping.register.option.application.domain.model

import com.example.cleanarchitecture.shopping.product.application.domain.model.OptionType

data class Option(
    val id: Long,
    val productId: Long,
    val name: String,
    val type: OptionType,
    val needed: Boolean,
    val optionDetails:List<OptionDetail> = listOf()
) {
    data class OptionDetail(
        val detail: String,
        val price: Long
    )
}
