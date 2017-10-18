package triangle.test;

import junit.framework.TestCase;
import static triangle.Triangle.Type.*;

public class TestSuite extends TestCase {

   public void test1() {
        assertEquals (triangle.Triangle.classify(0,1301,1), INVALID);
   }
}
