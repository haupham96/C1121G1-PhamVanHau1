package test.c10.model;

public abstract class Product {
    private String productID;
    private String productCode;
    private String productName;
    private int price;
    private int amount ;
    private String producer;

    public Product() {
    }

    public Product(String productID, String productCode, String productName, int price, int amount, String producer) {
        this.productID = productID;
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
        this.amount = amount;
        this.producer = producer;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return
                "productID='" + productID + '\'' +
                ", productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", producer='" + producer + '\'';
    }

    public String getInformation(){
        return this.productID+","+this.productCode+","+this.productName+","+this.price+","+this.amount+","+this.producer;
    }
}
