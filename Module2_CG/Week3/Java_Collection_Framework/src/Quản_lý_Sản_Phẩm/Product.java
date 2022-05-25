package Quản_lý_Sản_Phẩm;

public class Product {
    private String name;
    private int date;
    private int id;

    private double price;

    public Product() {
    }

    public Product(String name, int date, int id, double price) {
        this.name = name;
        this.date = date;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}
