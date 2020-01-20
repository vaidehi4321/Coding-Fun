import a.package1.HourGlass;
import org.junit.Assert;
import org.junit.Test;

public class TestHourGlass {
    @Test
    public void hourGlassTest1(){
        HourGlass h = new HourGlass();
       int[][] arr =  {{1, 1, 1, 0, 0, 0}, {0, 1, 0, 0, 0, 0},{1, 1, 1, 0, 0, 0},{0, 0, 2, 4, 4, 0},{0, 0, 0, 2, 0, 0},{0, 0, 1, 2, 4, 0}};
      int exp = 19;
      int act = h.hourglassSum(arr);
        Assert.assertEquals(exp,act);
    }

}
