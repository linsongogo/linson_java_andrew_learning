package method;

public class TestMethodOverloading {

  /**
   * Main method
   */
  public static void main(String[] args) {
    // Invoke the max method with int parameters
    System.out.println("The maximum of 3 and 4 is "
        + max(3, 4));//调用27行方法

    // Invoke the max method with the double parameters
    System.out.println("The maximum of 3.0 and 5.4 is "
        + max(3.0, 5.4));//调用39行方法

    // Invoke the max method with three double parameters
    System.out.println("The maximum of 3.0, 5.4, and 10.14 is "
        + max(3.0, 5.4, 10.14));//调用50行方法

    System.out.println(max(2, 2.5));//调用39行方法
  }

  /**
   * Return the max of two int values
   */
  public static int max(int num1, int num2) {
    if (num1 > num2) {
      return num1;
    } else {
      return num2;
    }
  }


  /**
   * Find the max of two double values
   */
  public static double max(double num1, double num2) {
    if (num1 > num2) {
      return num1;
    } else {
      return num2;
    }
  }

  /**
   * Return the max of three double values
   */
  public static double max(double num1, double num2, double num3) {
    return max(max(num1, num2), num3);
  }


  public static double max(double num1, double num2, double num3, double num4) {
    return max(max(max(num1,num2),num3),num4);
  }
}
