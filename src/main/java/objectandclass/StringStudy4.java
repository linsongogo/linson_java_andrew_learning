package objectandclass;

public class StringStudy4 {

  public static void main(String[] args) {

    String a = "Welcome to Java";
    char[] charArray = a.toCharArray();
    char[] cha = {'a','b'};

    for (char e : charArray) {
      System.out.println(e);
    }

    String b = new String(charArray);
    System.out.println(b);

    String c= String.valueOf(charArray);
    System.out.println(c);

    String d= String.valueOf(cha);
    System.out.println(d);
  }

}
