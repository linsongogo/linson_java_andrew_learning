package loop;

public class TestBreak {

  public static void main(String[] args) {
    int sum = 0;
    int number = 0;

    while (number < 20) {
      number++;
      sum += number;
      if (sum >= 100) {
       break;//结束整个循环
      }
    }
    System.out.println("The number is " + number);
    System.out.println("The sum is " + sum);

  }
}
