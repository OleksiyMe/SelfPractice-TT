package hlamAndGagbage.Muhtar27june22.carTask;

public class TestCars {

    public static void main(String[] args) {

        Audi audi1=new Audi("Q7","Red",2020,60_000);
        BMW bmw1=new BMW("X5", "Black", 2019, 40_000);
        Honda honda1=new Honda( "Accord", "White",2021,35000);
        Mercedes mercedes1=new Mercedes( "600", "Black",2022, 80000);
        Toyota toyota1=new Toyota( "Corolla", "White", 2020, 15000);
        Volvo volvo1=new Volvo( "X90", "Blue", 2021, 60000 );

        System.out.println(audi1 +"\n+" +
                bmw1 +"\n+" +
                honda1 +"\n+" +
                mercedes1 +"\n+" +
                toyota1 +"\n+"+
                volvo1 );



    }
}
