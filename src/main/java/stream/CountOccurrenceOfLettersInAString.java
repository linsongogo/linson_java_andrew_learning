package stream;


import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountOccurrenceOfLettersInAString {

  //计算字符串中每个字母出现的次数
  private static int count = 0;

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String s = input.nextLine();

    System.out.println("the occurrences of each letter are: ");

    Stream.of(toCharacterArray(s.toCharArray())).filter(e -> Character.isLetter(e))
        .map(e -> Character.toUpperCase(e))
        .collect(Collectors.groupingBy(e -> e, TreeMap::new, Collectors.counting()))
        .forEach((k, v) -> System.out.print(k + ":" + v + " "));
  }

  //toCharArray()返回原始的char类型数组，而of接受对象类型，需要将char类型转换成包装类toCharacterArray
  public static Character[] toCharacterArray(char[] list) {
    Character[] result = new Character[list.length];
    for (int i = 0; i < list.length; i++) {
      result[i] = list[i];
    }
    return result;
  }
}

