package com.example.api.v1

import com.example.model.cart.CartEvent
import com.example.model.cart.CartEventType
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1")
class ShoppingCartControllerV1(private val shoppingCartServiceV1: ShoppingCartServiceV1) {

    @Throws(Exception::class)
    @RequestMapping(path = ["/events"], method = [RequestMethod.GET])
    fun <T> addCartEvent(): ResponseEntity<T> {
        val cartEvent: CartEvent = CartEvent(cartEventType = CartEventType.CART_CLEARED, productId = "p", quantity = 0)
        shoppingCartServiceV1.addCartEvent(cartEvent) ?: throw Exception("Could not find shopping cart")
        return ResponseEntity(HttpStatus.NO_CONTENT)
    }
}
