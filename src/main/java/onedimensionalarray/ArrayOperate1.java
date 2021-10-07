package onedimensionalarray;

import java.util.Scanner;

public class ArrayOperate1 {

  public static void main(String[] args) {
    double myList[] = new double[10];

    Scanner input = new Scanner(System.in);
    System.out.print("Enter " + myList.length + " values: ");
    for (int i = 0; i < myList.length; i++) {
      myList[i] = input.nextDouble();
      System.out.print(myList[i] + " ");
    }


  }
}
