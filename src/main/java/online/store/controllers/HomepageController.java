package online.store.controllers;

import online.store.services.ProductsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

/**
 * @author Michael Pogrebinsky - www.topdeveloperacademy.com
 * Homepage REST controller
 */
@RestController
public class HomepageController {
    private final ProductsService productService;

    public HomepageController(ProductsService productService) {
        this.productService = productService;
    }

    @GetMapping("/categories")
    public String getProductCategories() {
        return productService.getAllSupportedCategories()
                .stream()
                .collect(Collectors.joining(","));
    }
}
