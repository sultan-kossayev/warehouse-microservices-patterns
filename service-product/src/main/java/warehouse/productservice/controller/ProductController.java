package warehouse.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import warehouse.productservice.model.Product;
import warehouse.productservice.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.POST)
    public Product create(Product product) {
        return productService.createProduct(product);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Product getById(@PathVariable String id) {
        return productService.getProductById(id);
    }
}
