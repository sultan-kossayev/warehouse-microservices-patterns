package warehouse.pricingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import warehouse.pricingservice.model.Price;
import warehouse.pricingservice.service.PricingService;

@RestController
@RequestMapping("/price")
public class PricingController {

    @Autowired
    private PricingService pricingService;

    @RequestMapping(method = RequestMethod.POST)
    public Price createPrice(@RequestParam("productId") String productId,
                             @RequestParam("priceValue") double priceValue,
                             @RequestParam("priceCurrency") String priceCurrency) {
        return pricingService.createPrice(productId, priceValue, priceCurrency);
    }


    @RequestMapping(method = RequestMethod.GET, value = "/product/{productId}")
    public Price getPriceForProduct(@PathVariable("productId") String productId) {
        return pricingService.getPriceForProduct(productId);
    }
}
