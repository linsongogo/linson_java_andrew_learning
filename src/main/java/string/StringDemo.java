package string;

import java.util.Locale;

public class StringDemo {

  public static void main(String[] args) {

    String message = "Welcome to Java!";
    System.out.println(message.length());
    System.out.println(message.charAt(3));
    System.out.println(message.concat("Andrew"));

    String concatAndrew = message.concat("Andrew");
    System.out.println(concatAndrew);

    System.out.println(message.toUpperCase());
    System.out.println(message.toLowerCase());

    String messageWithBlank = "   \tWelcome to Java!\n     ";
    System.out.println(messageWithBlank);
    System.out.println(messageWithBlank.trim());

  }

}
