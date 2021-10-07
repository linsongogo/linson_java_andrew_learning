package objectandclass;

import static java.math.BigDecimal.ROUND_DOWN;
import static java.math.BigDecimal.ROUND_UP;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.management.relation.RoleUnresolved;

public class BigIntegerAndBigDecimalDemo {

  public static void main(String[] args) {
    BigInteger a = new BigInteger("922337203685477580789898999999999999999999");
    BigInteger b = new BigInteger("99999999999");
    BigInteger c = a.multiply(b); // 9223372036854775807 * 2
    System.out.println(c);


    BigDecimal a1 = new BigDecimal(1.0);
    BigDecimal b1 = new BigDecimal(3);
    BigDecimal c1 = a1.divide(b1, 10, ROUND_UP);
    BigDecimal c2=a1.divide(b1,10,ROUND_DOWN);
    System.out.println(c1);
    System.out.println(c2);

  }

}
