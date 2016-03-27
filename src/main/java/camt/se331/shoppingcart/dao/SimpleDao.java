package camt.se331.shoppingcart.dao;

import camt.se331.shoppingcart.entity.Product;

import java.util.List;

/**
 * Created by KIMHUN on 3/27/2016.
 */
public class SimpleDao implements  ProductDao{
    @Override
    public List<Product> getProducts() {
        return null;
    }

    @Override
    public List<Product> getProductsByName(String name) {
        return null;
    }


    @Override
    public List<Product> getProductByDescription(String description) {
        return null;
    }

    @Override
    public Product getProduct(Long id) {
        return null;
    }

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public Product deleteProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }
}
