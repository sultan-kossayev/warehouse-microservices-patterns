package warehouse.pricingservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import warehouse.pricingservice.model.Price;

@Repository
public interface PricingRepo extends MongoRepository<Price, String> {

    Price findByProductId(String productId);
}
