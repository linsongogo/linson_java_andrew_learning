package objectandclass;

public class IntegerDemo {

  public static void main(String[] args) {
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);

    System.out.println(Integer.compare(10, 11));
    System.out.println(Integer.compare(10, 10));
    System.out.println(Integer.compare(10, 9));

    Integer o11 = Integer.valueOf("12");
    System.out.println(o11 == 12);

    System.out.println("==============");
    System.out.println(Integer.parseInt("2"));//2

    System.out.println(Integer.parseInt("11", 2));//3
    System.out.println(Integer.parseInt("11", 8));
    System.out.println(Integer.parseInt("13", 10));
    System.out.println(Integer.parseInt("1A", 16)); //26


  }
}
