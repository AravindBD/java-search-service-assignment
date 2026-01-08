
package com.example.inventory.config;

import com.example.inventory.entity.Product;
import com.example.inventory.repository.ProductRepository;
import org.springframework.stereotype.Component;

@Component
public class DataLoader {
    public DataLoader(ProductRepository repo) {
        repo.save(new Product("Mouse", 25));
        repo.save(new Product("Keyboard", 45));
        repo.save(new Product("Monitor", 120));
        repo.save(new Product("USB Cable", 10));
    }
}
