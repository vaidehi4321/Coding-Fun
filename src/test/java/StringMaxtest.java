import a.package1.StringMax;
import org.junit.Test;

public class StringMaxtest {
    @Test
    public void test(){
        StringMax s = new StringMax();
        String inp = "Forget  CVs..Save time . x x";
        int act = s.solution(inp);
    }
}
