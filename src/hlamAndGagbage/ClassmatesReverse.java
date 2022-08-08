package hlamAndGagbage;

public class ClassmatesReverse {
    public static void main(String[] args) {
        String [] classMates= {"Abdurasul Shirinboev", "Hrvoje Brkljacic", "Laziz Ernazarov",
                "Umran Ozman", "Oleksiy Melnychuk", "Flora Usanase Mivumbi", "Madina Rasullu", "Lorraine Cannom",
                "Ekaterina Sementeva", "Sumeye N Dalkilinc"};

        for (int i = 0; i < classMates.length; i++) {
            for(int j = classMates[i].length() -1 ; j >= 0; j--){
                System.out.print(classMates[i].charAt(j));
            }
            System.out.println();
        }
    }
}

