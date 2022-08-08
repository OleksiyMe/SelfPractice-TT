package hlamAndGagbage.muhtar30june22.statesTask;

public class StateObjects {

    public static void main(String[] args) {

        Virginia virginia=new Virginia("VI","Monkeys",
                "Eagle","Bars", 20_000_000, 0.20);

        California california=new California("CA","Snakes",
                "Dog", "Cat", 25_000_000, 0.23);
        Texas texas=new Texas("TX", "Monkeys","Hawk",
                "Toad", 40_000_000, 0.18);
        Florida florida=new Florida("FL", "Snakes",
                "Venom", "Spider", 18_000_000, 0.19);

        System.out.println(virginia);
        System.out.println(california);
        System.out.println(texas);
        System.out.println(florida);

    }


}
