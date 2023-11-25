package com.example.cleanarchitecture.shopping.product.application.domain.model

enum class ProductState(
    val state: String
) {
    REGISTER("등록"),
    PERMISSION("허가"),
    SELLING("판매중"),
    STOP("판매중지")
}