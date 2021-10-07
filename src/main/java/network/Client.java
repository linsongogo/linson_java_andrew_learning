package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

  public static void main(String[] args) {
    startClient();
  }

  public static void startClient() {

    try {

      //设置连接到服务器
      Socket socket = new Socket("localhost", 8000);
      DataInputStream inputFromServer = new DataInputStream(socket.getInputStream());
      DataOutputStream outputToServer = new DataOutputStream(socket.getOutputStream());

      while (true) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = input.nextDouble();

        outputToServer.writeDouble(radius);  // 传送到服务器
        outputToServer.flush();  // 清空缓存区数据流

        double area = inputFromServer.readDouble(); // 得到服务器计算后的数据

        System.out.println("Area is :" + area);
        System.out.println(socket.getLocalPort()); // 获取端口信息
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }


}
