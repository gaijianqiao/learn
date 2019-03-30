package my.learn.base.str;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestStr extends TestCase {

    @Test
    public void testStrEqual()
    {
        String a = "a";
        String b = "a";

        Assert.assertEquals(a,b);
        Assert.assertSame(a,b);

    }
}
