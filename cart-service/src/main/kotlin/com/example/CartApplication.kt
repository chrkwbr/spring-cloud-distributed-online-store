package com.example

import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder

@SpringBootApplication
//@EnableJpaRepositories
//@EnableJpaAuditing
//@EnableEurekaClient
//@EnableResourceServer
//@EnableOAuth2Client
//@EnableHystrix
class CartApplication

fun main(args: Array<String>) {
    SpringApplicationBuilder()
            .sources(CartApplication::class.java)
            .web(WebApplicationType.REACTIVE)
            .run(*args)
}
