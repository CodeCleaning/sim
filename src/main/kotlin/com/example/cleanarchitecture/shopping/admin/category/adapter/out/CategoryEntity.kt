package com.example.cleanarchitecture.shopping.admin.category.adapter.out

import com.example.cleanarchitecture.shopping.admin.category.application.domain.model.Category

class CategoryEntity(
    val id: Long = -1,
    val name: String,
    val path: String,
    val parentId: Long
) {
    fun toDto(): Category {
        return Category(
            id, name, path, parentId
        )
    }
}