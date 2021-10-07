package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaDemo1 {

  public static void main(String[] args) {
    HashMap<Integer, String> hash_map = new HashMap<>();
    hash_map.put(10, "Geeks");
    hash_map.put(15, "4");
    hash_map.put(20, "Geeks");
    hash_map.put(25, "Welcomes");
    hash_map.put(30, "You");

    for (Map.Entry<Integer, String> entry : hash_map.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }

    hash_map.forEach((k, v) -> {
      System.out.println(k + ":" + v);
    });

    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);

    list.forEach((k) -> System.out.println(k));

    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("Hello world");
      }
    });

    new Thread(() -> {
      System.out.println("Hello world");
    });

  }
}
