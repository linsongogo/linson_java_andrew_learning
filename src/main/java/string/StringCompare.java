package string;

import java.util.jar.JarEntry;

public class StringCompare {

  public static void main(String[] args) {
    String s1 = "Java";
    String s2 = "java";
    String s3 = "java";

    boolean b1 = s1.equals(s2);
    System.out.println(b1);
    boolean b2 = s2.equals(s3);
    System.out.println(b2);

    //如果比较操作符两边的操作数是引用类型，那么比较的是这两个引用类型所指向的对象的地址
    System.out.println(s1 == s2);

    boolean b3 = s1.equalsIgnoreCase(s2);
    System.out.println(b3);

    int r = s1.compareTo(s2);
    System.out.println(r);//十进制J=64，j=106,s1-s2=64-106=-32;第一个字符不相等，后面无须比较

    int r1 = s2.compareTo(s3);
    System.out.println(r1);

    int r2 = s1.compareToIgnoreCase(s2);
    System.out.println(r2);

    System.out.println(s1.startsWith("Ja"));
    System.out.println(s1.endsWith("va"));
    System.out.println(s1.startsWith("ava",1));
    System.out.println(s1.contains("va"));

  }

}
