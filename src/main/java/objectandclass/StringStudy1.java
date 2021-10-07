package objectandclass;

public class StringStudy1 {

  public static void main(String[] args) {

    String a = "Welcome to Java";

    String message = new String("Welcome to Java");

    char[] charArray = {'G', 'o', 'o', 'd'};
    String message2 = new String(charArray);

    System.out.println(a);
    System.out.println(message);
    System.out.println(message2);

    System.out.println(a==message); //String values are compared using '==', not 'equals()'
    System.out.println(a.equals(message));

  }

}
