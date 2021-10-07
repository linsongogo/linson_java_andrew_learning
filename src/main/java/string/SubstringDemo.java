package string;

public class SubstringDemo {

  public static void main(String[] args) {
    String message = "Welcome to Java!";
    System.out.println(message.substring(0, 2));
    System.out.println(message.substring(11));
    System.out.println(message.substring(2));

    String name = "Andrew Programing";

    int k = name.indexOf(' ');
    System.out.println(k);
    String firstName = name.substring(0, k);
    String lastName = name.substring(k + 1);

    System.out.println("first name:" + firstName + "\nlast name:" + lastName);

    String s="Welcome to Java!";
    System.out.println(s.indexOf('e'));
    System.out.println(s.indexOf('W',5));
    System.out.println(s.indexOf("come"));
    System.out.println(s.indexOf("come",2));

    System.out.println(s.lastIndexOf('e'));
    System.out.println(s.lastIndexOf('e',3));
    System.out.println(s.lastIndexOf("come"));
    System.out.println(s.lastIndexOf("come",4));



  }

}
