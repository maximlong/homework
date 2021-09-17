package homework8;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("d");
        list.add("b");
        list.add("a");

        System.out.println(duplicateList(list));
    }

    public static Set<String> duplicateList(List<String> list) {

        Set<String> set = new HashSet<>();

        set.addAll(list);

        return set;
    }
}