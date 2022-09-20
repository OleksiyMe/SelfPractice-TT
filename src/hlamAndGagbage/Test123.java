package hlamAndGagbage;

import hlamAndGagbage.Muhtar27june22.carTask.*;

import java.util.*;

public class Test123 {


    public static void main(String[] args) {

        String str1 ="Java", str2="Java1", str3="Java";

        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str1));

        System.out.println(str1.compareTo(str3));

        Audi audi1=new Audi("Q7","Red",2020,60_000);
        BMW bmw1=new BMW("X5", "Black", 2019, 40_000);
        Honda honda1=new Honda( "Accord", "White",2021,35000);
        Mercedes mercedes1=new Mercedes( "600", "Black",2022, 80000);
        Toyota toyota1=new Toyota( "Corolla", "White", 2020, 15000);
        Volvo volvo1=new Volvo( "X90", "Blue", 2021, 60000 );
        List<Car> list= Arrays.asList(audi1,bmw1,honda1,mercedes1,toyota1,volvo1);


        System.out.println( list.stream().min(Comparator.comparing(Car::getYear)) );

        System.out.println( list.stream().min(
                (a,b) ->   (a.getYear()<b.getYear())?-1:(a.getYear())> b.getYear()?1:0
        ) );

        Comparator.comparing(Car::getYear);

        List<Integer> listOfInt=new ArrayList<>(Arrays.asList(1,5,2,4,7,9,3,4,5,7));

      //  Collections.sort(listOfInt,(a,b)-> a<b?-1:(a>b)?1:0)  );

        Collections.sort(listOfInt,(a,b)-> a.compareTo(b) );
        System.out.println(listOfInt);


Comparator<Integer> compInt=(a,b)-> (a<b)?-1:(a>b)?1:0 ;

        Comparator<Integer> compInt2=(a,b)-> a.compareTo(b);

            }
}
