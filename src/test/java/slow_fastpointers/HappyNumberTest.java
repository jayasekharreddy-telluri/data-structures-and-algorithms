package slow_fastpointers;

import org.com.jai.pattrens.slow_fastpointers.HappyNumber;
import org.junit.Assert;
import org.junit.Test;

public class HappyNumberTest {

    @Test
    public void testOne(){

        Assert.assertFalse(HappyNumber.isHappy(12));

        Assert.assertTrue(HappyNumber.isHappy(23));

    }
}
