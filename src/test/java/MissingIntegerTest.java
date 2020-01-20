import a.package1.MissingInteger;
import org.junit.Assert;
import org.junit.Test;

public class MissingIntegerTest {
    @Test
    public void test1() {
        MissingInteger s1 = new MissingInteger();
        //given
        int[] A = {1,2,3,4};
        int exp = 5;
        int act = s1.missingInteger(A);
        Assert.assertEquals(exp,act);
    }

    @Test
    public void test2() {
        MissingInteger s1 = new MissingInteger();
        //given
        int[] A = {1};
        int exp = 2;
        int act = s1.missingInteger(A);
        Assert.assertEquals(exp,act);
    }

    @Test
    public void test3() {
        MissingInteger s1 = new MissingInteger();
        //given
        int[] A = {0};
        int exp = 1;
        int act = s1.missingInteger(A);
        Assert.assertEquals(exp,act);
    }

    @Test
    public void test4() {
        MissingInteger s1 = new MissingInteger();
        //given
        int[] A = {-1};
        int exp = 1;
        int act = s1.missingInteger(A);
        Assert.assertEquals(exp,act);
    }

    @Test
    public void test5() {
        MissingInteger s1 = new MissingInteger();
        //given
        int[] A = {-7};
        int exp = 1;
        int act = s1.missingInteger(A);
        Assert.assertEquals(exp,act);
    }

    @Test
    public void test6() {
        MissingInteger s1 = new MissingInteger();
        //given
        int[] A = {8};
        int exp = 9;
        int act = s1.missingInteger(A);
        Assert.assertEquals(exp,act);
    }

    @Test
    public void test7() {
        MissingInteger s1 = new MissingInteger();
        //given
        int[] A = {-1,-2,-3,-4};
        int exp = 1;
        int act = s1.missingInteger(A);
        Assert.assertEquals(exp,act);
    }

    @Test
    public void test8() {
        MissingInteger s1 = new MissingInteger();
        //given
        int[] A = {1000000000};
        int exp = 1;
        int act = s1.missingInteger(A);
        Assert.assertEquals(exp,act);
    }
}
