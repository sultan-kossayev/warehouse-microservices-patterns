package warehouse.pricingservice.service;

import warehouse.pricingservice.model.Price;

public interface PricingService {

    Price createPrice(String productId, double priceValue, String priceCurrency);

    Price getPriceForProduct(String productId);
}
