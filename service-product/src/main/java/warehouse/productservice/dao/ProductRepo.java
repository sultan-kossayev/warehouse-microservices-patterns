package warehouse.productservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import warehouse.productservice.model.Product;

@Repository
public interface ProductRepo extends MongoRepository<Product, String> {
}
