package mentorSession.mentorSession14sept22;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        Integer[] arr = {16, 3, 11, 5, 15};
        Integer target = 8;
        System.out.println(Arrays.toString( returnTwo(arr, target) ));
    }
    private static Integer[] returnTwo(Integer[] arr, Integer target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) return new Integer[]{target - arr[i],arr[i]};
            else map.put(arr[i], i);
        }
        return new Integer[] {};
    }

}
