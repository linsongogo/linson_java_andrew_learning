package selection;

import java.util.Scanner;

public class Alaa {

  public static void main(String[] args) {

    int a = (int) (Math.random() * 10);
    int b = (int) (Math.random() * 10);

    if(a<b) {
      int temp;
      temp = a;
      a = b;
      b = temp;
    }

    System.out.println(a + "-" + b);
    Scanner input = new Scanner(System.in);
    int answer = input.nextInt();

    if (a - b == answer) {
      System.out.println("dui");
    } else {
      System.out.println("cuo");
      System.out.println(a - b);
    }


  }
}