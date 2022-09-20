package SelfPracticeSumeyse_15sept22;

import java.util.*;

public class MostWaterTask {


    public static void main(String[] args) {
        Integer[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < height.length; i++) {
            map.put(i, height[i]);
        }
        Map.Entry<Integer, Integer> max1 = map.entrySet().stream()
                .max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 :
                        entry1.getValue() < entry2.getValue() ? -1 : 0).get();
        map.remove(max1.getKey());
        Map.Entry<Integer, Integer> max2 = map.entrySet().stream()
                .max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 :
                        entry1.getValue() < entry2.getValue() ? -1 : 0).get();

        System.out.println(max1+"\n"+max2);

      /*  int i=1,x=0,y=0;
        for (Map.Entry<Integer, Integer> eachEntry : map.entrySet()) {
            if (i==1){
                x=eachEntry.getKey();
                y=eachEntry.getValue();
                i++;
                continue;
            }
            if (i==2){
                x=Math.abs(x-eachEntry.getKey());
                y=Math.abs(y-eachEntry.getValue());
            break;
            }

        }*/
        //  System.out.println(x*y);

    }
}
