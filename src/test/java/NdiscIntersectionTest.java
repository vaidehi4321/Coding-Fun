import a.package1.NdiscIntersection;
import org.junit.Assert;
import org.junit.Test;

public class NdiscIntersectionTest {
    @Test
    public void test1(){
        NdiscIntersection n = new NdiscIntersection();
        Integer[]arr = {1,5,2,1,4,0};
        Integer exp = 11;
        Integer act = n.findIntersectingPairs(arr);
        Assert.assertEquals(exp,act);
    }
    @Test
    public void test2(){
        NdiscIntersection n = new NdiscIntersection();
        Integer[]arr = {-1,5,3,2,1,4,0};
        Integer exp = 14;
        Integer act = n.findIntersectingPairs(arr);
        Assert.assertEquals(exp,act);
    }
    @Test
    public void test3(){
        NdiscIntersection n = new NdiscIntersection();
        Integer[]arr = {1, 2147483647, 0 };
        Integer exp = 2;
        Integer act = n.findIntersectingPairs(arr);
        Assert.assertEquals(exp,act);
    }

}
