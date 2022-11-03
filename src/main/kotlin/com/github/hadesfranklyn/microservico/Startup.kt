package com.github.hadesfranklyn.microservico

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class Startup

fun main(args: Array<String>) {
    runApplication<Startup>(*args)
}
