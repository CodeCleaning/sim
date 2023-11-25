package com.example.cleanarchitecture.shopping.product.application.domain.model

enum class OptionType(
    val type: String
) {
    SINGLE("단일 선택"),
    MULTI("복수 선택")
}