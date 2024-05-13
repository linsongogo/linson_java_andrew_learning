package unitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTestDemo2Test {
    UnitTestDemo2 un = null;

    @Before
    public void beforeEveryTest() {
        System.out.println("TestCase execution start...");
       un = new UnitTestDemo2();
    }

    @After
    public void afterEveryTest() {
        System.out.println("TestCase execution finish...");
    }

    @Test
    public void addd() {
        int a = un.addd(1,2);
        assertEquals(3,a);


    }

    @Test
    public void subb() {
    }
}