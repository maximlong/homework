package homework8;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("max");
        list.add("maxim");
        list.add("maximlong");
        list.add("ml");

        System.out.println(deleteStrings(list));
    }

    public static List<String> deleteStrings(List<String> list) {

        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < 5) {
                list1.add(list.get(i));
            }
        }
        return list1;
    }
}
