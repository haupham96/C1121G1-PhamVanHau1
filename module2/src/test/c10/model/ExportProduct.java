package test.c10.model;

public class ExportProduct extends Product {
    private int exportPrice;
    private String countryImport;

    public ExportProduct() {
    }

    public ExportProduct(int productID, String productCode, String productName, int price, int amount, String producer, int exportPrice, String countryImport) {
        super(productID, productCode, productName, price, amount, producer);
        this.exportPrice = exportPrice;
        this.countryImport = countryImport;
    }

    public int getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(int exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getCountryImport() {
        return countryImport;
    }

    public void setCountryImport(String countryImport) {
        this.countryImport = countryImport;
    }

    @Override
    public String toString() {
        return "ExportProduct{" + super.toString() +
                " , exportPrice=" + exportPrice +
                ", countryImport='" + countryImport + '\'' +
                '}';
    }

    @Override
    public String getInformation() {
        return super.getInformation() + "," + this.exportPrice + "," + this.countryImport;
    }
}
