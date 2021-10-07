package stream;

import java.util.Scanner;
import java.util.stream.DoubleStream;

//提示用户在控制台输入一些数字，计算平均值，输出大于平均值的数有几个
public class AnalyzeNumbersUsingString {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter thr number of the items: ");

    int count = input.nextInt();

    double[] array = new double[count];
    System.out.println("Enter numbers: ");
    for (int i = 0; i < count; i++) {
      array[i] = input.nextInt();
    }
    double average = DoubleStream.of(array).average().getAsDouble();
    System.out.println("Average is: " + average);

    System.out.println(
        "numbers above average is " + DoubleStream.of(array).filter(e -> e > average).count());


  }
}
