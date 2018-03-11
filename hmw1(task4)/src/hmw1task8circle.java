import java.util.Scanner;

public class hmw1task8circle {

    /*8. Реализуй метод printCircleLength.
Параметр метода — радиус окружности.
Метод должен вывести на экран длину окружности, рассчитанной по формуле: L = 2 * Pi * radius.
Результат — дробное число (тип double).
В качестве значения Pi использовать значение 3.14.
     */


    public static void main (String[] args){
    printCircleLength(1);

    }

    public static void printCircleLength(int a) {

       double pi=3.14;

       System.out.println("Введи радиус окружности: ");
       Scanner scan = new Scanner(System.in);
       double L=0;
       double r = scan.nextDouble();//for radius, write data
            L=2*pi*r;

        System.out.println("Длина окружности составляет: "+ L);
    }
}
