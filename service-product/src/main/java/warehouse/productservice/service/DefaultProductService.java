package warehouse.productservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import warehouse.productservice.dao.ProductRepo;
import warehouse.productservice.model.PriceValue;
import warehouse.productservice.model.Product;

@Service
public class DefaultProductService implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private PriceService priceService;

    @Override
    public Product createProduct(Product data) {
        return productRepo.save(data);
    }

    @Override
    public Product getProductById(String id) {
        Product product = productRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Unknown product"));
        PriceValue price = priceService.getPriceForProduct(product.getId());

        product.setPrice(price);

        return product;
    }
}
