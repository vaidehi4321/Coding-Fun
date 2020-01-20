import a.package1.BinaryGap;
import org.junit.Assert;
import org.junit.Test;

public class TestBinaryGap {
    @Test
    public void test1(){
        BinaryGap bg = new BinaryGap();
       // System.out.println(bg.solution(390));
        Assert.assertEquals(4,bg.solution(390));
    }

    @Test
    public void test2(){
        BinaryGap bg = new BinaryGap();
         System.out.println(bg.solution(43));
        Assert.assertEquals(1,bg.solution(43));
    }

    @Test
    public void test3(){
        BinaryGap bg = new BinaryGap();
        System.out.println(bg.solution(100));
        Assert.assertEquals(2,bg.solution(100));
    }
    @Test
    public void test4(){
        BinaryGap bg = new BinaryGap();
        System.out.println(bg.solution(561892));
        Assert.assertEquals(3,bg.solution(561892));
    }
}
