package mentorSession.mentorSession_3aug2020;

public class SaleHotDogs {
    public static void main(String[] args) {

        int numberOfCustomers=10;
        System.out.println("Price for HotDog for "+numberOfCustomers+" cuctomers is "+priceForHotDog(numberOfCustomers));

    }

    private static int priceForHotDog(int numberOfCustomers) {

        return (numberOfCustomers<5)?100:(numberOfCustomers<10)?95:90;

    }
}
