import a.package1.LeftRotateArray;
import org.junit.Assert;
import org.junit.Test;

public class LeftRotateArrayTest {
    @Test
    public void leftRotateArrayTest(){
        //given
        int[]arr = {1, 2, 3, 4, 5};
        int d = 4;
        LeftRotateArray l = new LeftRotateArray();
        int[]exp = {5, 1, 2, 3, 4};
        int[]act = l.leftRotate(arr,d);

            Assert.assertArrayEquals(exp, act);
        }
    }

