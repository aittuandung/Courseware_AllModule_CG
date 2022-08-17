package Quản_lý_sản_phẩm_lưu_ra_file_nhị_phân;

import java.io.Serializable;

public class Product implements Serializable {
    private String productId;
    private String productName;
    private String agency;
    private String price;

    public Product() {
    }

    public Product(String productId, String productName, String agency, String price) {
        this.productId = productId;
        this.productName = productName;
        this.agency = agency;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", agency='" + agency + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
