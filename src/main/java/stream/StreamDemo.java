package stream;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo {

  public static void main(String[] args) {
    String[] names = {"John", "Peter", "Susan", "Kim", "Jen", "George", "Alan", "Stacy", "Michelle",
        "john"};
    Stream.of(names).limit(4).sorted()
        .forEach(e -> System.out.print(e + " ")); //John Kim Peter Susan

    System.out.println();
    Stream.of(names).skip(4).sorted((e1, e2) -> e1.compareToIgnoreCase(e2))
        .forEach(e -> System.out.print(e + " ")); //Alan George Jen john Michelle Stacy
    System.out.println();
    Stream.of(names).skip(4).sorted(String::compareToIgnoreCase)
        .forEach(e -> System.out.print(e + " ")); //Alan George Jen john Michelle Stacy

    System.out.println();
    System.out.println(Stream.of(names).anyMatch(e -> e.equals("Stacy"))); //true
    System.out.println(Arrays.asList(names).contains("Stacy")); //true

    System.out.println(Stream.of(names).allMatch(e -> Character.isUpperCase(e.charAt(0)))); //false

    System.out.println(Stream.of(names).noneMatch(e -> e.startsWith("Ko"))); //true

    System.out.println(Stream.of(names).map(e -> e.toUpperCase()).distinct().count()); //9
    System.out.println(Stream.of(names).map(String::toUpperCase).distinct().count()); //9

    Object[] array = Stream.of(names).map(e -> e.toLowerCase()).toArray();
    System.out.println(Arrays.toString(array));
    //[john, peter, susan, kim, jen, george, alan, stacy, michelle, john]

  }
}
