package hlamAndGagbage;
import java.util.Scanner;
public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String shoppingList = "";
        int itemCount = 1;
        double totalCost = 0;
        while (true){

            System.out.println("Enter Item"+itemCount + " and its price:");
            String itemName = input.nextLine();
            double priceItem = input.nextDouble();
            totalCost += priceItem;
            input.nextLine();
            System.out.println("Add one more item?");
            String questionToContinue = input.nextLine();
            shoppingList += "Item"+itemCount +": "+itemName+" Price: "+priceItem+", ";
            itemCount++;
            if (questionToContinue.equals("no")){
                break;
            }
        }
        System.out.println(shoppingList.substring(0,shoppingList.lastIndexOf(',')));
        System.out.println("Total price: "+totalCost);

    }
}