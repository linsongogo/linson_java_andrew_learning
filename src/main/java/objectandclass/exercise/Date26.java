package objectandclass.exercise;

import java.util.Date;

public class Date26 {

  public static void main(String[] args) {
    Date date = null;
    m(date);
    System.out.println(date);

    Date date1 = new Date(1234567);
    m1(date1);
    System.out.println(date1.getTime());

    Date date2 = new Date(1234567);
    m2(date2);
    System.out.println(date2.getTime());

    Date date3 = new Date(1234567);
    m3(date3);
    System.out.println(date3.getTime());
  }


  public static void m(Date date) {
    date = new Date();
  }

  public static void m1(Date date) {
    date = new Date(7654321);
  }

  public static void m2(Date date) {
    date.setTime(7654321);
  }

  public static void m3(Date date) {
    date = null;
  }
}
