package test.c10.model;

public class ImportProduct extends Product{
    private int importPrice;
    private String importProvince;
    private double importTax ;

    public ImportProduct() {
    }

    public ImportProduct(String productID, String productCode, String productName, int price, int amount, String producer, int importPrice, String importProvince, double importTax) {
        super(productID, productCode, productName, price, amount, producer);
        this.importPrice = importPrice;
        this.importProvince = importProvince;
        this.importTax = importTax;
    }

    public int getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(int importPrice) {
        this.importPrice = importPrice;
    }

    public String getImportProvince() {
        return importProvince;
    }

    public void setImportProvince(String importProvince) {
        this.importProvince = importProvince;
    }

    public double getImportTax() {
        return importTax;
    }

    public void setImportTax(double importTax) {
        this.importTax = importTax;
    }

    @Override
    public String toString() {
        return "ImportProduct{" + super.toString()+
                " , importPrice=" + importPrice +
                ", importProvince='" + importProvince + '\'' +
                ", importTax='" + importTax + '\'' +
                '}';
    }

    @Override
    public String getInformation() {
        return super.getInformation()+","+this.importPrice+","+this.importProvince+","+this.importTax;
    }
}
