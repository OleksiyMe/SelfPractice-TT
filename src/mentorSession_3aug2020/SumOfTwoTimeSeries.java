package mentorSession_3aug2020;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwoTimeSeries {
    public static void main(String[] args) {

        Map<Integer, Double> seriesA = new HashMap<>();
        seriesA.put(1, 1.0);
        seriesA.put(2, 1.5);
        seriesA.put(3, 2.0);
        Map<Integer, Double> seriesB = new HashMap<>();
        seriesB.put(2, 1.0);
        seriesB.put(3, 2.5);
        seriesB.put(5, 1.0);

        System.out.println("seriesA = " + seriesA);
        System.out.println("seriesB = " + seriesB);
        System.out.println("Sum of Two Time Series:\n" +
                twoTimeSeriesSum(seriesA, seriesB));


    }

    private static Map<Integer, Double> twoTimeSeriesSum(Map<Integer, Double> seriesA,
                                                         Map<Integer, Double> seriesB) {

        for (Map.Entry<Integer, Double> eachEntry : seriesA.entrySet()) {
            if ( seriesB.containsKey( eachEntry.getKey()))

            seriesB.put(eachEntry.getKey(),
                    seriesB.get(eachEntry.getKey()) + eachEntry.getValue());

            else seriesB.put(eachEntry.getKey(),eachEntry.getValue());

        }
        return seriesB;
    }
}
