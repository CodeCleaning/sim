package com.example.cleanarchitecture

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CleanArchitectureApplication

fun main(args: Array<String>) {
    runApplication<CleanArchitectureApplication>(*args)
}

// TODD: version1 : 완전 결합
// TODO: version2 : 각자 분리
// TODO: version3 : Facade