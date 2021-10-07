package basic;

import java.util.Scanner;

public class ReadFromKeyboard {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);// System.in 从标准输入流（终端）中读取用户输入的数据

    byte byteValue = input.nextByte();
    System.out.println(byteValue);
    System.out.println("You type" + byteValue);

    int intValue = input.nextInt();
    System.out.println("You type" + intValue);

    double doubleValue = input.nextDouble();
    System.out.println(doubleValue);

    float floatValue = (float) input.nextDouble();
    System.out.println(floatValue);

    /*

    Scanner input = new Scanner(System.in);

    byte byteValue = input.nextByte();
    System.out.println("You type:" + byteValue);

    int intValue = input.nextInt();
    System.out.println("You type:" + intValue);

    */

  }

}
