
package com.example.search.service;

import com.example.search.dto.ProductDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class SearchService {

    private final RestTemplate restTemplate;

    public SearchService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<String> getProductsUnder50() {
        ProductDTO[] products = restTemplate.getForObject(
                "http://localhost:8081/api/inventory/products",
                ProductDTO[].class
        );

        return Arrays.stream(products)
                .filter(p -> p.getPrice() < 50)
                .map(ProductDTO::getName)
                .sorted()
                .collect(Collectors.toList());
    }
}
