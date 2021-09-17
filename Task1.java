package homework8;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(reverseString(list));
    }

    public static List<String> reverseString(List<String> list) {

        List<String> list1 = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            list1.add(list.get(i));
        }
        return list1;
    }
}
