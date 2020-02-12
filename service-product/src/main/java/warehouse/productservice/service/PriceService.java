package warehouse.productservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import warehouse.productservice.model.PriceValue;

@FeignClient(name = "pricingservice")
@Service
public interface PriceService {

    @RequestMapping(method = RequestMethod.GET, value = "/pricingservice/v1/price/product/{productId}")
    PriceValue getPriceForProduct(@PathVariable("productId") String productId);
}
