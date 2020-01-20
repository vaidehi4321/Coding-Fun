import a.package1.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void checkTriangleTest(){
        Triangle t = new Triangle();
        Integer[]arr = {10,2,5,1,8,20};
        Integer exp = 1;
        Integer act = t.checkTriangle(arr);

        Assert.assertEquals(exp,act);
    }
    @Test
    public void checkTriangleTestNeg(){
        Triangle t = new Triangle();
        Integer[]arr = {10,50,5,1};
        Integer exp = 0;
        Integer act = t.checkTriangle(arr);

        Assert.assertEquals(exp,act);
    }
}
