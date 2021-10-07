package datastructure.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String>  hashset = new HashSet<>();

        hashset.add("one");
        hashset.add("two");
        hashset.add("three");

        hashset.add("one");  //存放不重复的数据。

        System.out.println(hashset);  // [one, two, three]

        hashset.remove("one");  // [two, three]
        System.out.println(hashset);

        System.out.println(hashset.contains("two1"));// .contains()方法，查找，boolean

        Set<String> hashset2 = new HashSet<>();
        hashset2.add("three");
        hashset2.add("four");
        hashset2.add("five");

        hashset.removeAll(hashset2);
        System.out.println(hashset); // [two]

        hashset.addAll(hashset2);
        System.out.println(hashset);  // [four, two, three, five]

        hashset.retainAll(hashset2); // .retainAll() 取交集
        System.out.println(hashset);  // [four, three, five]

    }
}
