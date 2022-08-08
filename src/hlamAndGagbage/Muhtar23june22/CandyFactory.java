package hlamAndGagbage.Muhtar23june22;

import java.util.ArrayList;

public class CandyFactory {
    public static void main(String[] args) {


   ArrayList<Candy> list=new ArrayList<>();

   list.add(new Candy("Roshen",2,10, true));
        list.add(new Candy("ABK",1,0, false));
        list.add(new Candy("Mars",10,10, false));
        list.add(new Candy("ABK2",5,20, true));
        list.add(new Candy("ABK",6,11, false));

        System.out.println(list);
        for (Candy each : list) {
           if (each.getPrice()==0){
               System.out.println(each.getBrand() + " FREE");
               continue;
           }
            System.out.println(each.getBrand() + " "+each.getPrice());
        }


    }
}
