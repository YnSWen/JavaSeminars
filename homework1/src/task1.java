//1) Вычислить суммy чисел от 1 до n
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) throws Exception{
        countSum();;
    }

    public static void countSum(){
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input a value for n: ");
        int N = iScanner.nextInt();
        iScanner.close();
        int sum = 0;
        for (int i = 1; i <= N; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
