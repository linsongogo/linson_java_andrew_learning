package unitTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class UnitTestDemo1Test {

  UnitTestDemo1 instance1 = null;
  static UnitTestDemo1 instance2 = null;

  //在所有testCase执行之前被执行，且仅执行一次
  @BeforeClass
  public static void beforeClass() {
    System.out.println("Before class Method...");
    instance2 = new UnitTestDemo1();
  }

  @AfterClass
  public static void afterClass() {
    System.out.println("After class Method...");
  }

  //每个testCase执行之前执行
  @Before
  public void beforeEveryTest() {
    System.out.println("TestCase execution start...");
    instance1 = new UnitTestDemo1();
  }

  @After
  public void afterEveryTest() {
    System.out.println("TestCase execution finish...");
  }

  //引用所指向的实例不是同一个，因为test中执行了两次new，创建了两个对象
  //@Ignore
  @Test
  public void add() {
    System.out.println(instance1.hashCode());
    System.out.println(instance2.hashCode());
    assertEquals(2, instance1.add(1, 1)); //断言
  }

  @Test
  public void sub() {
    System.out.println(instance1.hashCode());
    System.out.println(instance2.hashCode());
    assertEquals(0, instance1.sub(1, 1));
  }

  @Test(expected = ArithmeticException.class)
  public void testException() {
    int r = 1 / 0;
  }

  @Test(timeout = 2000)
  public void testTimeout() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void testAssertFalse() {
    assertFalse(1 > 2);
  }

  @Test
  public void testAssertTure() {
    assertTrue(2 > 1);
  }

  @Test
  public void testFail() {
    fail("I set it to fail");
  }
}