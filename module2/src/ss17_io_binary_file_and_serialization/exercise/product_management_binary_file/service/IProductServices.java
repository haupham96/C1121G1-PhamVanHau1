package ss17_io_binary_file_and_serialization.exercise.product_management_binary_file.service;

import java.io.Serializable;

public interface IProductServices extends Serializable {
    void addProduct();
    void displayProductList();
    void findProduct();
}
