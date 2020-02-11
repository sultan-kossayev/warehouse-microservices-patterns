package warehouse.pricingservice.service;

import warehouse.pricingservice.model.Price;

public interface PricingService {

    Price createPrice(String productId, String priceValue, String priceCurrency);

    Price getPriceForProduct(String oroductId);
}
