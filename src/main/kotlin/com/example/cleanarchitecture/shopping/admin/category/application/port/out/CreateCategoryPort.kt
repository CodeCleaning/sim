package com.example.cleanarchitecture.shopping.admin.category.application.port.out

import com.example.cleanarchitecture.shopping.admin.category.application.domain.model.Category

interface CreateCategoryPort {
    fun saveCategory(category: Category)
}