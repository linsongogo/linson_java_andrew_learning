package stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StreamTest {

  public static void main(String[] args) {
    Double[] numbers = {2.4, 55.6, 90.12, 26.5, 44.2};
    Set<Double> set = new HashSet<>(Arrays.asList(numbers));
    int count = 0;
    for (double e : set) {
      if (e > 60) {
        count++;
      }
    }
    System.out.println("Count is " + count);

    System.out.println("Count is " + set.stream().filter(e -> e > 60).count());
  }
}
