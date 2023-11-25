package com.example.cleanarchitecture.shopping.product.adapter.out

import com.example.cleanarchitecture.shopping.register.product.application.domain.model.Option
import com.example.cleanarchitecture.shopping.register.product.application.port.out.RegisterProductOptionPort
import org.springframework.stereotype.Component

@Component
class RegisterProductOptionAdapter(
    private val optionRepository: OptionRepository
) : RegisterProductOptionPort {
    override fun registerProductOption(option: Option): Option {
//        optionRepository.save(OptionEntity(
//            option.id,
//            option.name,
//            option.optionDetails,
//
//        ))

        return option
    }
}