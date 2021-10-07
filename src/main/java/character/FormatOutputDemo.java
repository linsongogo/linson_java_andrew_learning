package character;

import java.sql.SQLOutput;
import java.util.Arrays;

public class FormatOutputDemo {

  public static void main(String[] args) {
    double amount = 12618.98;
    double interestRate = 0.0013;
    double interest = amount * interestRate;
    System.out.println(interest);
    System.out.println("Interest is $" + (int) (interest * 100) / 100.0);

    System.out.printf("Interest is $%6.2f", interest);
    System.out.println();

    System.out.printf("%3d#%2s#%8.6f\n", 1234, "333", 65.8888);

    System.out.printf("%8d%8s%8.1f\n", 1234, "Java", 5.63);
    System.out.printf("%-8d%-8s%-8.1f\n", 1234, "Java", 5.63);

    System.out.println("smith\\exam1\\test");
    System.out.println((int) 'm');
    System.out.println((int) 'n');
    System.out.println(109/110);


  }

}
