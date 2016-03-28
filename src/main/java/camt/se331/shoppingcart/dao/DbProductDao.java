package camt.se331.shoppingcart.dao;

import camt.se331.shoppingcart.entity.Product;
import camt.se331.shoppingcart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Film on 3/27/2016.
 */
@Repository
public class DbProductDao implements ProductDao {


    @Autowired
    ProductRepository productRepository;

    @Override
<<<<<<< HEAD
    public List<Product> getProductsByNameContaining(String name) {
        return productRepository.findByNameContaining(name);
=======
    public List<Product> getProductsByNameOrDescription(String name, String description) {
        return productRepository.findByNameOrDescriptionContainingIgnoreCase(name,name);
>>>>>>> 9c0aae3afe197fad80d5bfdf2221f5cef03bf66a
    }
    

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();

    }

    @Override
    public List<Product> getProductByDescription(String description) {

        return null;
    }


    @Override
    public Product getProduct(Long id) {
        return productRepository.findOne(id);

    }


    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);

    }


    @Override
    public Product deleteProduct(Product product) {
        productRepository.delete(product);
        product.setId(null);
        return product;

    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);

    }
}

