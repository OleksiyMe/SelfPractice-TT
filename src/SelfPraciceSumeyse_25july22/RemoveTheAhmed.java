package SelfPraciceSumeyse_25july22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveTheAhmed {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        String name = "Ahmed";

        System.out.println(removeHim6(list, name));

    }
    public static ArrayList<String> removeHim1(ArrayList<String> list, String name) {
        list.removeIf(p -> p.equals(name));
        return list;
    }
    public static ArrayList<String> removeHim2(ArrayList<String> list, String name) {
        ArrayList<String> result = new ArrayList<>();
        for (String each : list) {
            if (!each.equals(name)) result.add(each);
        }
        return result;
    }
    public static ArrayList<String> removeHim3(ArrayList<String> list, String name) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next().equals(name)) it.remove();
        }
        return list;
    }
    public static ArrayList<String> removeHim4(ArrayList<String> list, String name) {
        String str[] = list.toArray(new String[0]);
        String result =
                Arrays.toString(str).replace(name + ",", "").
                        replace(" ", "").replace("[", "").
                        replace("]", "");
        ArrayList<String> resultList = new ArrayList<>(
                Arrays.asList(result.split(","))
        );
        return resultList;
    }
    public static ArrayList<String> removeHim5(ArrayList<String> list, String name) {
        ArrayList<String> result = new ArrayList<>();
        list.forEach(p->{
            if (!p.equals(name)) result.add(p);
        });
        return result;
    }
    public static ArrayList<String> removeHim6(ArrayList<String> list, String name) {
        list.removeAll(Arrays.asList(name));
        return list;
    }


}
