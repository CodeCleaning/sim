package com.example.cleanarchitecture.shopping.product.adapter.`in`

import com.example.cleanarchitecture.shopping.register.product.application.domain.model.Option
import com.example.cleanarchitecture.shopping.register.product.application.domain.model.OptionType
import com.example.cleanarchitecture.shopping.register.product.application.domain.model.Product
import com.example.cleanarchitecture.shopping.register.product.application.port.`in`.RegisterProductOptionUseCase
import com.example.cleanarchitecture.shopping.register.product.application.port.`in`.RegisterProductUseCase
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RegisterProductWebAdapter(
    private val registerProductUseCase: RegisterProductUseCase,
    private val registerOptionUseCase: RegisterProductOptionUseCase
) {
    @PostMapping("/product")
    fun registerProduct(
        registerProductRequest: com.example.cleanarchitecture.shopping.product.adapter.`in`.RegisterProductWebAdapter.RegisterProductRequest
    ): ResponseEntity<Long> {
        val product = registerProductUseCase.registerProduct(
            Product(
                name = registerProductRequest.name,
                categoryId = registerProductRequest.categoryId,
                price = registerProductRequest.price,
                description = registerProductRequest.description
            )
        )
        val option = registerOptionUseCase.registerProductOption(
            Option(
                productId = product.id,
                name = product.name,
                type = registerProductRequest.option.type,
                needed = registerProductRequest.option.needed,
                optionDetails = registerProductRequest.option.optionDetails.map {
                    Option.OptionDetail(
                        detail = it.detail,
                        price = it.price
                    )
                }
            )
        )
        return ResponseEntity(product.id, HttpStatus.CREATED)
    }

    data class RegisterProductRequest(

        val name: String,
        val categoryId: Long,
        val price: Long,
        val description: String,
        val option: com.example.cleanarchitecture.shopping.product.adapter.`in`.RegisterProductWebAdapter.RegisterProductRequest.RegisterOptionRequest
    ) {
        data class RegisterOptionRequest(
            val name: String,
            val type: OptionType,
            val needed: Boolean,
            val optionDetails: List<com.example.cleanarchitecture.shopping.product.adapter.`in`.RegisterProductWebAdapter.RegisterProductRequest.RegisterOptionRequest.OptionDetail>
        ) {
            data class OptionDetail(
                val detail: String,
                val price: Long
            )
        }
    }
}
