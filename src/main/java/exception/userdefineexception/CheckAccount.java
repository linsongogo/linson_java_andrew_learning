package exception.userdefineexception;

public class CheckAccount {
    private double amount;

    public CheckAccount(double amount) {
        this.amount = amount;
    }

    public double withdraw(double number) throws InsufficientFundsException {
        //检查自定义异常，需要在方法中声明此异常
        throw new InsufficientFundsException(number - amount);
//        if (number > this.amount) {
//            // 抛出异常，由client中的main函数调用了此方法，所以main函数需要捕获此异常
//            throw new InsufficientFundsException(number - amount);
//        } else {
//            return amount - number;
//        }
    }
}
