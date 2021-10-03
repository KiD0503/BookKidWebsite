package com.example.bookkidwebsite.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @GetMapping(value = {"/", "/home"})
    public String index(){
        return "HomePage/index";
    }

    @GetMapping("/shop-grid")
    public String viewShopGridPage() {
        return "HomePage/shop-grid";
    }

    @GetMapping("/shop-details")
    public String viewShopDetailPage(){
        return "HomePage/shop-details";
    }
    @GetMapping("/shopping-cart")
    public String viewShoppingCart(){
        return "HomePage/cart-shopping";
    }
    @GetMapping("/contact")
    public String viewContactPage(){
        return "HomePage/contact";
    }

    @GetMapping("/checkout")
    public String viewCheckout(){
        return "HomePage/checkout";
    }
}
