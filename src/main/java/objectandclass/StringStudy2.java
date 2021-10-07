package objectandclass;

import java.util.Arrays;

public class StringStudy2 {

  public static void main(String[] args) {

    String a = "Welcome";

    System.out.println(a.replace('e', 'E'));

    System.out.println(a.replaceFirst("e", "E"));

    System.out.println(a.replaceAll("e", "E"));

    System.out.println(a.replaceFirst("c", "C"));

    String b = "Java is great!";
    String[] result = b.split(" ");
    System.out.println(Arrays.toString(result));

    String c = new String("Welcome to java and game");
    String[] result1= c.split(" ",4);
    System.out.println(Arrays.toString(result1));

  }
}
