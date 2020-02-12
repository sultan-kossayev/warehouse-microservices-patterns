package warehouse.pricingservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import warehouse.pricingservice.dao.PricingRepo;
import warehouse.pricingservice.model.Price;

@Service
public class DefaultPricingService implements PricingService {

    @Autowired
    private PricingRepo pricingRepo;

    @Override
    public Price createPrice(String productId, double priceValue, String priceCurrency) {
        Price price = new Price();
        price.setProductId(productId);
        price.setCurrencyIso(priceCurrency);
        price.setValue(priceValue);

        return pricingRepo.save(price);
    }

    @Override
    public Price getPriceForProduct(String productId) {
        return pricingRepo.findByProductId(productId);
    }
}
