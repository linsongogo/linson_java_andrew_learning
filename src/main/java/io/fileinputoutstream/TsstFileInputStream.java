package io.fileinputoutstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class TsstFileInputStream {

  public static void main(String[] args) {
    try(FileOutputStream output=new FileOutputStream("Number.dat")){
      for(int i=1; i<=10;i++){
        output.write(i);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
