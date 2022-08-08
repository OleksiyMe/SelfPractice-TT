package hlamAndGagbage.Muhtar23june22;

public class Candy {

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            System.err.println("Quantity can not be 0 or below 0: " + quantity);
            System.exit(1);
        }


        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.err.println("Price can not be below 0: " + price);
            System.exit(1);
        }

        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        this.brand = brand;
        setQuantity(quantity);
        setPrice(price);
        this.hasPeanuts = hasPeanuts;
    }

    public String toString() {

        return "Candy{" +
                "brand='" + getBrand() + '\'' +
                ", quantity=" + getQuantity() +
                ", price=" + ( ( getPrice() == 0)? "free" : getPrice()   )+
                ", hasPeanuts=" + isHasPeanuts() +
                '}';

    }

}
