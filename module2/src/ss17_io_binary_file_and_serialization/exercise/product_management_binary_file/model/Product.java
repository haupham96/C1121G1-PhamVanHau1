package ss17_io_binary_file_and_serialization.exercise.product_management_binary_file.model;

import java.io.Serializable;

public class Product implements Serializable {
    private String ID;
    private String name;
    private String manufacturer;
    private int price;

    public Product() {
    }

    public Product(String ID, String name, String manufacturer, int price) {
        this.ID = ID;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                '}';
    }

    public String getInformation(){
        return this.ID+","+this.name+","+this.manufacturer+","+this.price;
    }
}
