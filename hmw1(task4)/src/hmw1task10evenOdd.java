import java.util.Scanner;

public class hmw1task10evenOdd {

    /*10.
    Создать метод, проверяющий и сообщающий на экран,
    является ли целое число записанное в переменную n, чётным или нечётным.

    */

    public static void main(String[] args)  {
        eo(1,1);

    }


    public static int eo(int a, int b) {

        System.out.println("input digit");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();//write data from keyboard to variable "number"

        if (n % 2 == 0) {
            System.out.println("This digit is even: "+n);
        } else  {
            System.out.println("This digit "+ n + " is odd");

        }

        return a;
    }
}


