// Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task2 {
    public static void execute(){
        Random rnd = new Random();
        List<Integer> iList = new ArrayList<>(15);

        for (int i = 0; i < 15; i++){
            iList.add(rnd.nextInt(100));       
        }
        System.out.println(iList);

        List<Integer> delList = new ArrayList<>(15);

        for (Integer num: iList) {
            if (num % 2 == 0) delList.add(num);
            }
            iList.removeAll(delList);  
            System.out.println(iList);   
    }
}


