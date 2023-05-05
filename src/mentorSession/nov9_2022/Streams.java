package mentorSession.nov9_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));


        List<Integer>result=list.stream().filter(p->p>2).collect(Collectors.toList());

        System.out.println(result);

        Integer max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(list);
        System.out.println(max);

    }
}
