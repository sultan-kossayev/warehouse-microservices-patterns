package warehouse.productservice.service;

import warehouse.productservice.model.Product;

public interface ProductService {

    Product createProduct(Product data);

    Product getProductById(String id);
}
