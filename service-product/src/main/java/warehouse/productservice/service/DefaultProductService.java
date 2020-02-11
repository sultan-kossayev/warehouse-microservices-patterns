package warehouse.productservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import warehouse.productservice.dao.ProductRepo;
import warehouse.productservice.model.Product;

@Service
public class DefaultProductService implements ProductService {

    @Autowired
    ProductRepo productRepo;

    @Override
    public Product createProduct(Product data) {
        return productRepo.save(data);
    }

    @Override
    public Product getProductById(String id) {
        return productRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Unknown product"));
    }
}
