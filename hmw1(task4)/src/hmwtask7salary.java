import java.util.Scanner;

import static jdk.nashorn.internal.objects.Global.print;

public class hmwtask7salary {

  /*  7.
    Реализовать метод public static void salary(int a).
    Метод должен увеличить переданное число на 100 и вывести на экран надпись: «Твоя зарплата составляет: a долларов в месяц.»
    Где a — это переданное число, которое увеличили на 100.
    Пример вывода на экран для а = 700:
    Твоя зарплата составляет: 800 долларов в месяц.

            Требования:
            1. Программа должна выводить текст на экран.
            2. Метод main не должен вызывать System.out.println или System.out.print.
            3. Метод salary не должен возвращать результат.
            4. Метод main должен вызвать метод salary только один раз.
            5. Метод salary должен увеличить переданное число на 100 и вывести на экран надпись согласно шаблону*/

    public static void main(String[] args) {
        salary(700);
    }

    public static void salary(int a) {
        int z = 2;
        //int b = a+100;
        System.out.println("Введи сумму своей зарплаты: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();//write data from keyboard to variable "number"

        System.out.println("Твоя зарплата составляет: " + (number+100) + "долларов в месяц.");


    }
}
