
package com.example.search.controller;

import com.example.search.service.SearchService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/search")
public class SearchController {

    private final SearchService service;

    public SearchController(SearchService service) {
        this.service = service;
    }

    @GetMapping("/products")
    public List<String> search() {
        return service.getProductsUnder50();
    }
}
