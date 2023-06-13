// 3) Реализовать простой калькулятор
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) throws Exception{
        Calculator();
    }

    public static void Calculator (){
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input first number: ");
        int firstNum = iScanner.nextInt();
        System.out.printf("Input second number: ");
        int secondNum = iScanner.nextInt();
        System.out.printf("Input +, -, * or %: ");
        char Sign = iScanner.next().charAt(0);
        iScanner.close();

        if (Sign == '+'){
            System.out.print(firstNum + secondNum);
        }
        if (Sign == '-'){
            System.out.print(firstNum - secondNum);
        }
        if (Sign == '*'){
            System.out.print(firstNum * secondNum);
        }
        if (Sign == '%'){
            System.out.print(firstNum % secondNum);
        }


    }
}

