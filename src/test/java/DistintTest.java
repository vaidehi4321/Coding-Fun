import a.package1.Distint;
import org.junit.Assert;
import org.junit.Test;

public class DistintTest {
    @Test
    public void distinctTest(){
        Distint d = new Distint();
        Integer[]arr = {2,8,8,6,-1,7,9,8,5,6};
        Integer exp = 7;
        Assert.assertEquals(exp,d.numOfDistinct(arr));
    }
}
