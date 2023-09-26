package com.seosh817.example

import com.seosh817.annotation.Builder
import com.seosh817.example.car.EngineBuilder

fun main() {
    val car = CarBuilder
        .name("seosh817 car")
        .brand("hyundai")
        .engine(
            EngineBuilder
                .name("diesel")
                .fuel(123)
                .build()
        )
        .build()

    print("car name : ${car.name}")
    print("car engine : ${car.engine.name}")
}

@Builder
data class Car(
    val name: String,
    val brand: String,
    val engine: Engine,
) {

    @Builder
    data class Engine(
        val name: String,
        val fuel: Int,
    )
}
