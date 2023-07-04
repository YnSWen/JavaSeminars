import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array :: ");
        int size = scanner.nextInt();
        System.out.println("Enter the elements of the array :: ");
        int[] myArray = new int[size];
        for(int i=0; i<size; i++) {
            myArray[i] = scanner.nextInt();
        }
        task2.heapSort(myArray, size);
    }
}

