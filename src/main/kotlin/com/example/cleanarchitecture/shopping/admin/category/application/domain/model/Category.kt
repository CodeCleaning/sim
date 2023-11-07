package com.example.cleanarchitecture.shopping.admin.category.application.domain.model

data class Category(
    val id: Long,
    val name: String,
    val path: String,
    val parentId: Long
)