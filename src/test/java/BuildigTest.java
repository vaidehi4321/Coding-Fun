import a.package1.Building;
import org.junit.Test;

public class BuildigTest {
    @Test
    public void test() {
        int[] i = {1, 3, 2, 1, 2, 1, 5, 3, 3, 4, 2};
        Building b = new Building();
        int act = b.solution(i);
        System.out.println("res=" + act);
    }
}
