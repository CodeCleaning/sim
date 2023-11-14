package com.example.cleanarchitecture

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@EnableCaching
@SpringBootApplication
class CleanArchitectureApplication

fun main(args: Array<String>) {
    runApplication<CleanArchitectureApplication>(*args)
}