package unitTest;

import org.junit.*;

import static org.junit.Assert.*;

public class UnitTestDemo2Test {
    UnitTestDemo2 un = null;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("before class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("after class");
    }



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
        assertEquals(3,un.subb(4,1));
    }
}