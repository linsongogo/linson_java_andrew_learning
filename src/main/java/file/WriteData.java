package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;

public class WriteData {

  public static void main(String[] args) throws FileNotFoundException {
    // PrintWriter 类中包含了必检异常
    File file = new File("scores1.txt");

    if(file.exists()){
      System.out.println("File already exists!");
      System.exit(0); // 正常退出（0），异常退出（非零值）
    }//去掉这个判断用户可随意更改文件内容

//    Writer out;
    PrintWriter output=new PrintWriter(file);


    output.print("Andrew Programming ");
    output.println(90);

    output.print("Eric ");
    output.println(180);

    output.close();
  }

}
