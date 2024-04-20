package com.marsaf.productservicemaven.repository;

import com.marsaf.productservicemaven.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
