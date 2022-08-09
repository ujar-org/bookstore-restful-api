package org.ujar.basics.restful.bookstore.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ujar.basics.restful.bookstore.service.CheckoutService;
import org.ujar.basics.restful.bookstore.web.dto.Purchase;
import org.ujar.basics.restful.bookstore.web.dto.PurchaseResponse;

@RestController
@RequestMapping("/api/v1/checkout")
record CheckoutController(CheckoutService checkoutService) {

  @PostMapping("/purchase")
  PurchaseResponse placeOrder(@RequestBody final Purchase purchase) {
    return checkoutService.placeOrder(purchase);
  }

}









