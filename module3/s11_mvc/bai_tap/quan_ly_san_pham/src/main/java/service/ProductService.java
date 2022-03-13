package service;

import model.Product;

import java.util.List;

public interface ProductService {
    List<Product> listProducts();

    void createProduct(Product product);

    Product findByName(String name);

    Product findById(Integer id);

    void delete(Integer id);

    List<Product> search(String name);

    void edit(Integer id, String name, String price, String des, String manufacturer);
}
