package recursive;

import java.io.File;
import java.util.Scanner;

public class DirectorySize {

  public static void main(String[] args) {
    // Prompt the user to enter a directory or a file
    System.out.print("Enter a directory or a file: ");
    Scanner input = new Scanner(System.in);
    String directory = input.nextLine();

    // Display the size
    System.out.println(getSize(new File(directory)) + " bytes");
  }

  private static long getSize(File file) {
    long size = 0;
    if (file.isFile()) {
      size = file.length(); //定义BaseCase终止条件（是个文件）
    } else {
      File[] files = file.listFiles();   // 是文件夹，遍历，计算文件夹中所有文件大小，累加
      for (int i = 0; i < files.length; i++) {
        size += getSize(files[i]);   // 递归（文件夹中既有文件夹又有文件）
      }
    }
    return size;
  }

}