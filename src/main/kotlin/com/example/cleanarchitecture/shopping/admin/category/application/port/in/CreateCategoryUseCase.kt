package com.example.cleanarchitecture.shopping.admin.category.application.port.`in`

import com.example.cleanarchitecture.shopping.admin.category.application.domain.model.Category

interface CreateCategoryUseCase {
    fun createCategory(category: Category)
}
