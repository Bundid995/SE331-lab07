package camt.se331.shoppingcart.service;

import camt.se331.shoppingcart.entity.Product;

import java.util.List;

/**
 * Created by Dto on 2/7/2015.
 */
public interface ProductService {
<<<<<<< HEAD
    List<Product>getProductsByNameContaining(String name);
=======
  /**  List<Product>getProductsByName(String name);*/



    List<Product> getProductsByNameOrDescription(String name,String description);

>>>>>>> 9c0aae3afe197fad80d5bfdf2221f5cef03bf66a
    List<Product> getProducts();
    Product getProduct(Long id);
    Product addProduct(Product product);
    Product deleteProduct(Long id);
    Product updateProduct(Product product);


}
