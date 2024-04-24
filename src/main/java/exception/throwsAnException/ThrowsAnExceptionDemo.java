package exception.throwsAnException;

public class ThrowsAnExceptionDemo {

    public void deposit(double amount) throws RuntimeException{
        // Method implementation 免检查异常，可以不用throws
        try {
            System.out.println(1 / 0);
        } catch (RuntimeException e) {
            System.out.println("我不处理这个异常，留给调用者处理吧！");
            throw e; // 在deposit方法中抛出 异常e，交给此方法的调用者处理
        }

    }

    // Remainder of class definition
    public static void main(String[] args) {
        // main 方法中可以不声明异常
        ThrowsAnExceptionDemo throwsAnExceptionDemo = new ThrowsAnExceptionDemo();
        try {
            throwsAnExceptionDemo.deposit(1);
        } catch (RuntimeException e) {
            System.out.println("main method handle it!");
            throw e; // 再次抛出e ，由于此时已是main方法，则会由java jvm检测到此异常，再次抛出会导致程序崩溃。注释掉此行代码则不会
        }
    }


}
