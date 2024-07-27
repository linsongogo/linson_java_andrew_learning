package unitTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class) //使参数化
public class AbsTest {

  int input;
  int excepted;

  public AbsTest(int input, int excepted) {
    this.input = input;
    this.excepted = excepted;
  }

  @Parameterized.Parameters
  public static Collection<Object[]> data() {

    return Arrays.asList(new Object[][]{{0, 0}, {1, 1}, {-1, 1}});
  }

  @Test
  public void testAbs() {
//    int r = Math.abs(this.input);
    assertEquals(this.excepted, Math.abs(this.input));
  }
}
