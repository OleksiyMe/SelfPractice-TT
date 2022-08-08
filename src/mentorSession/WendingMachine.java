package mentorSession;

public class WendingMachine {
    public static void main(String[] args) {
        int sum_cents = 100;
        int price_cents = 1;

        findAChange(price_cents,sum_cents);

    }

    public static void findAChange(int price, int sum) {

        int change =sum-price;
        int quarters = change/25;
        int dimes = (change -25*quarters)/10;
        int nickels = (change-25*quarters -10*dimes)/5;
        int pennies = change-25*quarters-10*dimes-5*nickels;

        System.out.println("quarters = " + quarters);
        System.out.println("dimes = " + dimes);
        System.out.println("nickels = " + nickels);
        System.out.println("pennies = " + pennies);




    }

}

/*
* A sum is given
*
* sum - price = change
*
*
* Find a change in quaters dimes and nickels and pennies
*
*
*
*  */