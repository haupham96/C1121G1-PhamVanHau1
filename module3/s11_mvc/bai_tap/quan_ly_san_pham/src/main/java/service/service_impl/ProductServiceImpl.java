package service.service_impl;

import model.Product;
import service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
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
        return products;
    }

    @Override
    public void createProduct(Product product) {
        products.add(product);
    }

    @Override
    public Product findByName(String name) {
        Product product = null;
        for (Product list : products) {
            if (list.getName().equals(name)) {
                product = list;
            }
        }
        return product;
    }

    @Override
    public Product findById(Integer id) {
        Product product = null;
        for (Product list : products) {
            if (list.getId() == id) {
                product = list;
            }
        }
        return product;
    }

    @Override
    public void delete(Integer id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
            }
        }
    }

    @Override
    public List<Product> search(String name) {
        List<Product> productList = new ArrayList<>();
        for (Product list : products) {
            if (list.getName().contains(name)) {
                productList.add(list);
            }
        }
        return productList;
    }

    @Override
    public void edit(Integer id, String name, String price, String des, String manufacturer) {
        for (Product ls : products) {
            if (ls.getId() == id) {
                ls.setName(name);
                ls.setPrice(price);
                ls.setDescription(des);
                ls.setManufacturer(manufacturer);
                break;
            }
        }
    }


}
