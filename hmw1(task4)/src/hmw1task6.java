public class hmw1task6 {

  /*  6.
    Реализовать метод print. Метод должен вывести на экран переданную строку 4 раза. Каждый раз с новой строки.

            Требования:
            1. Программа должна выводить текст на экран.
            2. Метод main не должен вызывать System.out.println или System.out.print.
            3. Метод print должен выводить текст на экран.
            4. Метод main должен вызвать метод print класса только один раз.
            5. Метод print должен выводить на экран строку 4 раза. Каждый раз с новой строки.*/

  public static void main (String[] args) {
      print("");
  }
   public static void print (String args) {
      int z = 2;
      int b = 0;
      String q = "This is a text";

      while (b < 4) {
          b++;
          System.out.println("This text is for test");
      }


  }


}
