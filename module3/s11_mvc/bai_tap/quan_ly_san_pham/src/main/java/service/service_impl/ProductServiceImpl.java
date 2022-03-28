package service.service_impl;

import model.Product;
import repository.IProductRepository;
import repository.impl.ProductRepository;
import service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private IProductRepository repository = new ProductRepository();

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
