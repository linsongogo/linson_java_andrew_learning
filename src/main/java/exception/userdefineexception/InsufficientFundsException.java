package exception.userdefineexception;

public class InsufficientFundsException extends Exception {
    // 自定义了异常类InsufficientFundsException，继承Exception，自定义异常类和其他类也一样。
    private double amount;

    public InsufficientFundsException(double amount) {
        // 自定义异常类里的构造方法，即具体的异常，和普通类里的构造方法一致
        this.amount = amount;
    }

    public double getAmount() {
        // 自定义异常类里的具体方法，即具体的异常。
        return amount;
    }
}
