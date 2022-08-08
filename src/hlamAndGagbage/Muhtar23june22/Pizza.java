package hlamAndGagbage.Muhtar23june22;

public class Pizza {

    private String size;
    private int numberOfCheeseToppings, numberOfPepperoniToppings;


    public String getSize() {

        return size;
    }

    public void setSize(String size) {
        size = size.toLowerCase();
        if (! (size.equals("small") || size.equals("medium") || size.equals("large"))) {
            System.err.println("Size can only be \"small\", \"medium\" or \"large\": " + size);
            System.exit(1);
        }

        this.size = size;
    }

    public int getNumberOfCheeseToppings() {

        return numberOfCheeseToppings;
    }

    public void setNumberOfCheeseToppings(int numberOfCheeseToppings) {
        String cheeseErr = "maximum number of cheese toppings is:\n" +
                "\" small: 3\"\n" +
                "\" medium: 4\"\n" +
                "\" large: 5\"";

        if (size.equals("small") && numberOfCheeseToppings > 3 ||
                size.equals("medium") && numberOfCheeseToppings > 4 ||
                size.equals("large") && numberOfCheeseToppings > 5
        ) {
            System.err.println(cheeseErr +"\n your pizza is "+size+
                    " and your number ofCheese toppings is "+numberOfCheeseToppings);
            System.exit(1);
        }
if (numberOfCheeseToppings<0){
    System.err.println("Number of Cheese Toppings can not be negative " +numberOfCheeseToppings);
    System.exit(1);

}

        this.numberOfCheeseToppings = numberOfCheeseToppings;
    }

    public int getNumberOfPepperoniToppings() {
   return numberOfPepperoniToppings;
    }

    public void setNumberOfPepperoniToppings(int numberOfPepperoniToppings) {

        String cheeseErr = "\"maximum number of Pepperoni toppings is:\\n\" +\n" +
                "\"small: 4\"\n" +
                "\"medium: 5\"\n" +
                "\"large: 6\"";
        if (size.equals("small") && numberOfPepperoniToppings > 4 ||
                size.equals("medium") && numberOfPepperoniToppings > 5 ||
                size.equals("large") && numberOfPepperoniToppings > 6
        ) {
            System.err.println(cheeseErr +"\n your pizza is "+size+
                    " and your number of Pepperoni toppings is "+numberOfPepperoniToppings);
            System.exit(1);
        }
        if (numberOfPepperoniToppings<0){
            System.err.println("Number of Pepperoni Toppings can not be negative " +numberOfPepperoniToppings);
            System.exit(1);

        }

        this.numberOfPepperoniToppings = numberOfPepperoniToppings;
    }

    public Pizza(String size, int numberOfCheeseToppings, int numberOfPepperoniToppings) {
        setSize(size);
        setNumberOfCheeseToppings(numberOfCheeseToppings);
        setNumberOfPepperoniToppings(numberOfPepperoniToppings);
    }

    public double calcCost(){

       if (size.equals("small")) return 10+2*(numberOfCheeseToppings+numberOfPepperoniToppings);
        if (size.equals("medium")) return 12+2*(numberOfCheeseToppings+numberOfPepperoniToppings);
         return 14+2*(numberOfCheeseToppings+numberOfPepperoniToppings);

    }


    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseToppings=" + getNumberOfCheeseToppings() +
                ", numberOfPepperoniToppings=" + getNumberOfPepperoniToppings() +
                ", TotalCost=" + calcCost() +

                '}';
    }
}
