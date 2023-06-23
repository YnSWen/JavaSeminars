// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, 
// который вернет “перевернутый” список.

import java.util.LinkedList;

public class task1 {
    public static void execute(){
        LinkedList<String> list = new LinkedList<>();
        list.add("cat");
        list.add("mouse");
        list.add("rabbit");
        list.add("horse");

        for (int i = 0; i <= list.size()/2; i++) {
            String temp = list.get(i);
            list.set(i, list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, temp);
        }

    }
}

