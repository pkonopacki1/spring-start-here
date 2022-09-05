package com.konopackipio1.sqch8ex5.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.konopackipio1.sqch8ex5.model.Product;
import com.konopackipio1.sqch8ex5.services.ProductService;

@Controller
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String viewProducts(Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);

        return "products.html";
    }

    @PostMapping("/products")
    public String addProduct(Product product, Model model) {
        productService.addProduct(product);

        List<Product> products = productService.findAll();
        model.addAttribute("products", products);

        return "products.html";
    }

}
