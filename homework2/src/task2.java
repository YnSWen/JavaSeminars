// Реализуйте алгоритм сортировки пузырьком числового массива, результат 
// после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.XMLFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class task2 {

    public static void Logging() {
        Logger logger = Logger.getLogger(task2.class.getName());
        logger.setLevel(Level.FINE);
        logger.setUseParentHandlers(false);
        
        try {
            FileHandler fh = new FileHandler("log.xml");
            logger.addHandler(fh);

            XMLFormatter xml = new XMLFormatter();
            fh.setFormatter(xml);
        }
        catch (SecurityException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void BubbleSortWithLog(Logger logger){
        int[] arr = {50, 64, 4, 2, 17};
        boolean isSorted = false;
        int temp;

        System.out.println(arr);

        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]){
                    isSorted = false;
                    logger.info(arr[i] + "-" + arr[i + 1]);

                    temp = arr[i];
                    arr[i] = arr[i +1 ];
                    arr[i + 1] = temp;
                }           
            }
        }
    System.out.println(Arrays.toString(arr));
    }
}
