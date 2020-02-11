package warehouse.productservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import warehouse.productservice.model.Product;

public interface ProductRepo extends MongoRepository<Product, String> {
}
