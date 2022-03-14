package repository;

import model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> listProducts();

    void createProduct(Product product);

    Product findById(Integer id);

    void delete(Integer id);

    List<Product> search(String name);

    void edit(Integer id, String name, String price, String des, String manufacturer);
}
