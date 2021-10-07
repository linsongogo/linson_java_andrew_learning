package loop;

public class TestContinue {

  public static void main(String[] args) {
    int sum = 0;
    int number = 0;

    while (number < 20) {
      number++;
      if (number == 10 || number == 11) {
        continue;//跳过当前迭代，即跳过10或11
      }
      sum += number;
    }

    System.out.println("The sum is " + sum);
  }
}
