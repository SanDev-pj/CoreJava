package COLLECTION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class IterationOnList {

    public static void main(String[] args) {
        List<String> dataArr = new ArrayList<>();

        while (dataArr.size() != 10) {
            dataArr.add("" + ThreadLocalRandom.current().nextInt(1, 20));
        }

        showElement(dataArr);

        String[] names = { "Sandeep", "Prasad", "Jena" };

        getResults(names).forEach(System.out::println);

        Integer[] list = {1001,1002,1003};

        getMap(list).forEach((key,value)-> System.out.println(key + " " + value));

        Set<String> setNames = new HashSet<>(Arrays.asList(names));


        checkName(setNames,"Sandeep").forEach(System.out::println);

        viewElements(new HashMap<Integer,String>(){{put(1001,"Sandeep");put(1002,"Prasad");}});

    }
    //question 1 - lvl - 1
    private static void showElement(List<String> dataArr) {

        if (dataArr.isEmpty()) {
            System.out.println("\n\t\t\t\tNo Data Present !!");
        } else {
            dataArr.forEach(System.out::println);
        }

    }
    //question 2 - lvl - 1
    public static List<String> getResults(String[] names) {

        List<String> nameList = Arrays.asList(names);

        nameList = nameList.stream().map(s -> s.substring(0, s.length() / 2).toLowerCase()
                + s.substring(s.length() / 2, s.length()).toUpperCase()).collect(Collectors.toList());

        return nameList;

    }
    //question 3 - lvl - 1
    public static Map<Integer, Integer> getMap(Integer[] number) {

        Map<Integer, Integer> intergerKey = new HashMap<>();
        Arrays.asList(number).forEach(s ->  intergerKey.put(ThreadLocalRandom.current().nextInt(1,10), s));

        return intergerKey;

    }
    //question 4 - lvl - 1
    public static Set<String> checkName(Set<String> nameList,String name ) {

        if(nameList.stream().anyMatch((s)-> s.equalsIgnoreCase(name))) {
            System.out.printf("\nFind the name Match ' %s ' in the set\n\n",name);
            nameList.remove(name);
        }else {
            System.out.println("Don't Find name the Match ");
        }

        return nameList;

    }
    //question 5 - lvl - 1

    public static void viewElements(Map<Integer,String> map) {

        map.forEach((key,val)-> System.out.printf("/n%d = %s\n",key,val));

    }

}