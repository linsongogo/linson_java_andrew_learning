package basic;

import java.util.Scanner;

public class ComputeLoan {

  public static void main(String[] args) {
    //创建Scanner这个对象
    Scanner input = new Scanner(System.in);

    //输入年利率
    System.out.println("Enter annual interest,e.g , 4.5%");
    double annualInterestRate = input.nextDouble();

    //获得月利率 12个月 百分比转换
    double monthlyInterestRate = annualInterestRate / 1200;

    //输入年份
    System.out.println("Enter years:");
    int numberOfYears = input.nextInt();

    //输入贷款额度
    System.out.println("Enter loan amount");
    double loanAmount = input.nextDouble();

    //计算支付额度
    double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math
        .pow(1 + monthlyInterestRate, numberOfYears * 12));
    double totalPayment = monthlyPayment * numberOfYears * 12;

    //输出结果
    System.out.println("The monthly payment is $" + (int)monthlyPayment);
    System.out.println("The total payment is $" + (int)totalPayment);

  }

}
