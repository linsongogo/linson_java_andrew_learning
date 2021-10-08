package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AAA {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try {
      int id = input.nextInt();
      String name = input.next();
      System.out.println("id = " + id + "\n" + "name" + name);
    } catch(InputMismatchException ex) {
      System.out.println("输入数据不合规范");
      System.exit(1);
      ex.printStackTrace();
    } finally {
      System.out.println("输入结束");
    }
  }
}
