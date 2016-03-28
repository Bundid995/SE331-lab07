package camt.se331.shoppingcart.dao;

import camt.se331.shoppingcart.entity.Product;

import java.util.List;

/**
 * Created by Dto on 2/7/2015.
 */
public interface ProductDao {
<<<<<<< HEAD
    List<Product>getProductsByNameContaining(String name);
=======
 /**   List<Product>getProductsByName(String name); */

    List<Product> getProductsByNameOrDescription(String name,String description);
>>>>>>> 9c0aae3afe197fad80d5bfdf2221f5cef03bf66a
    List<Product> getProducts();
    List<Product> getProductByDescription(String description);
    Product getProduct(Long id);
    Product addProduct(Product product);
    Product deleteProduct(Product product);
    Product updateProduct(Product product);

}
