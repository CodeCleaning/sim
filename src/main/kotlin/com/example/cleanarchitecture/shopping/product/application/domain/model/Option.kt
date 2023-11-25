package com.example.cleanarchitecture.shopping.product.application.domain.model

data class Option(
    val id: Long = 0L,
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
