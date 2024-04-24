package exception.throwsAnException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class BasicDemo {
// myMethod 是检查性异常，且在方法内没有处理异常，所以需要在调用该方法的地方捕获异常。basicDemo 调用了此异常。
  public static void main(String[] args)  {
    BasicDemo basicDemo = new BasicDemo();
    try {
      basicDemo.myMethod();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void myMethod() throws Exception {
    throw new Exception("String");
  }

}
