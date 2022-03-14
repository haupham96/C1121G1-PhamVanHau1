package service.service_impl;

import model.Product;
import repository.IProductRepository;
import repository.impl.ProductRepository;
import service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private IProductRepository repository = new ProductRepository();
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "iPhone1", "1000", "old but good", "Apple1"));
        products.add(new Product(2, "iPhone2", "2000", "look good", "Apple2"));
        products.add(new Product(3, "iPhone3", "3000", "feel good", "Apple3"));
        products.add(new Product(4, "iPhone4", "4000", "shake it", "Apple4"));
        products.add(new Product(5, "iPhone5", "5000", "water resists", "Apple5"));
        products.add(new Product(6, "iPhone6", "6000", "turn on the beats", "Apple6"));
    }

    @Override
    public List<Product> listProducts() {
        return repository.listProducts();
    }

    @Override
    public void createProduct(Product product) {
       repository.createProduct(product);
    }


    @Override
    public Product findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void delete(Integer id) {
       repository.delete(id);
    }

    @Override
    public List<Product> search(String name) {
        return repository.search(name);
    }

    @Override
    public void edit(Integer id, String name, String price, String des, String manufacturer) {
        repository.edit(id, name, price, des, manufacturer);
    }


}
