package hlamAndGagbage.Muhtar23june22;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!Character.isLetter(name.charAt(0))) {
            System.err.println("First char of name must be letter " + name);
            System.exit(1);
        }

        if (name.isBlank()) {
            System.err.println("Name can not be blank or empty " + name);
            System.exit(1);
        }
        for (int i = 0; i < name.length(); i++) {

            if (!Character.isLetter(name.charAt(i)) && name.charAt(i) !=' ') {
                System.err.println("Name can not contain special characters " + name);
                System.exit(1);
            }
        }


        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) {
            System.err.println("Unit Price  can not be negative " + unitPrice);
            System.exit(1);
        }

        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        if (quantity < 0) {
            System.err.println("Quantity can not be negative " + quantity);
            System.exit(1);
        }
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

public double calCost(){

        return unitPrice*quantity;
}


    public String toString() {
        return "Item{" +
                "name='" + getName() + '\'' +
                ", unitPrice=" + getUnitPrice() +
                ", quantity=" + getQuantity() +
                ", total cost= " + calCost() +


                '}';
    }
}
