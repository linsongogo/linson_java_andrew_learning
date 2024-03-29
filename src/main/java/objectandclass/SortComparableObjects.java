package objectandclass;

import java.math.BigInteger;

public class SortComparableObjects {

  public static void main(String[] args) {
    String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
    java.util.Arrays.sort(cities);
    for (String city : cities) {
      System.out.print(city + " ");
    }
    System.out.println();

    Integer[] integers={15,14,5,77,9};
    java.util.Arrays.sort(integers);
    for(Integer integer:integers){
      System.out.print(integer+" ");
    }
    System.out.println();

    BigInteger[] hugeNumbers = {new BigInteger("232323109292"),
        new BigInteger("432232323239292"),
        new BigInteger("54623239292")};
    java.util.Arrays.sort(hugeNumbers);
    for (BigInteger number : hugeNumbers) {
      System.out.print(number + " ");
    }
  }
}