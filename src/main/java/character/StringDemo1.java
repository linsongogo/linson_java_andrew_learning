package character;

import java.util.Locale;

public class StringDemo1 {

  public static void main(String[] args) {
    String message = "Welcome to Java";
    System.out.println(message.length());
    int length1 = "Welcome to Java".length();
    System.out.println(length1);

    String message2= "\t  w   e   l  ";
    System.out.println(message.length());
    System.out.println(message.charAt(0));
    System.out.println(message.concat(message2));
    System.out.println(message.toUpperCase());
    System.out.println(message.toLowerCase());
    System.out.println(message2.trim());


  }
}
