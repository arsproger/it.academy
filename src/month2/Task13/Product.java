package month2.Task13;

public class Product {
    String name;
    double price;
    String expirationDate;

    public Product(double price, String bestBeforeDate) {
        this.price = price;
        expirationDate = bestBeforeDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", BestBeforeDate='" + expirationDate + '\'' +
                '}';
    }
}
