public class hmw1task9minimum {

    /*
    9. Написать функцию min которая принимает 2 параметра и возвращает меньший из них.
Тут надо использовать конструкцию if else
public class Solution {
    public static int min(int a, int b) {
        //напишите тут ваш код
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}

     */
    public static void main(String[] args)  {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));

    }


    public static int min(int a, int b) {
        //int a=12;
        //int b=33;

        if (a < b) {
            //System.out.println(a);
        } else if (a > b) {
            //System.out.println(b);

        }

        return a;
    }
}