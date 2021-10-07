package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

  public static void main(String[] args) {
    startServer();
  }

  public static void startServer() {
    try {

      ServerSocket serverSocket = new ServerSocket(8000); // 创建套结字
      Socket socket = serverSocket.accept(); //设置服务器监听

      // 设置输入输出流
      DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());
      DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());

      while (true) {
        double radius = inputFromClient.readDouble(); //客户端接收数据
        double area = radius * radius * Math.PI;  // 计算面积

        outputToClient.writeDouble(area); //将结果传给客户端
        outputToClient.flush();
        System.out.println("Area is :" + area + " and already sent to client!");
      }
    } catch (IOException ex) {
     ex.printStackTrace();
    }
  }
}
