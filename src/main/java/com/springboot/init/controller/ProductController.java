package com.springboot.init.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping
    public String getProduct() {
        return "Done!";
    }

    @PostMapping
    public String postProduct() {
        return "Done!";
    }

    @PutMapping
    public String putProduct() {
        return "Done!";
    }

    @DeleteMapping
    public String deleteProduct() {
        return "Done!";
    }
}
