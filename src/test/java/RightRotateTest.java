import a.package1.RightRotate;
import org.junit.Assert;
import org.junit.Test;

public class RightRotateTest {
    @Test
    public void test1(){
        int[] A = {3, 8, 9, 7, 6};
        int K = 3;
        RightRotate r = new RightRotate();
       int[] expected = {9, 7, 6, 3, 8};
       int[] actual = r.rightRotate(A,3);
        Assert.assertArrayEquals(expected,actual);
    }
    @Test
    public void test2(){
        int[]A = {1, 2, 3, 4};
        int K = 4;
        RightRotate r = new RightRotate();
        int[] expected = {1, 2, 3, 4};
        int[] actual = r.rightRotate(A,4);
        Assert.assertArrayEquals(expected,actual);
    }
    @Test
    public void test3(){
        int[]A = {0, 0, 0};
        int K = 1;
        RightRotate r = new RightRotate();
        int[] expected = {0, 0, 0};
        int[] actual = r.rightRotate(A,1);
        Assert.assertArrayEquals(expected,actual);
    }
    @Test
    public void test4(){
        int[]A = {1, 2, 3, 4};
        int K = 6;
        RightRotate r = new RightRotate();
        int[] expected = {3, 4, 1, 2};
        int[] actual = r.rightRotate(A,6);
        Assert.assertArrayEquals(expected,actual);
    }
}
