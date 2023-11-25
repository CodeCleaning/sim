package com.example.cleanarchitecture.shopping.product.adapter.`in`

import com.example.cleanarchitecture.shopping.register.product.application.domain.model.Product
import com.example.cleanarchitecture.shopping.register.product.application.port.`in`.SearchProductCommand
import com.example.cleanarchitecture.shopping.register.product.application.port.`in`.SearchProductUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class SearchProductWebAdapter(
    private val searchProductUseCase: SearchProductUseCase
) {
    @GetMapping("category/{categoryId}/product")
    fun searchProduct(
        @PathVariable("categoryId") categoryId: Long,
        @RequestParam("sort") sort: String,
        @RequestParam("pageSize") size: Long?,
    ): SearchProductResponse {
        val command = SearchProductCommand(
            categoryId,
            sort
        )
        searchProductUseCase.searchProduct(command)
        return SearchProductResponse(
            searchProductUseCase.searchProduct(command)
        )
    }

    data class SearchProductResponse(
        val data: List<Response>
    ) {
        constructor(products: List<Product>) : this(
            products.map { product ->
                Response(
                    product.id,
                    product.name
                )
            }
        )
        data class Response(
            val id: Long,
            val name: String
        )
    }
}