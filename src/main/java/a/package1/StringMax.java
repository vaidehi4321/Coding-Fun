package a.package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringMax {
    public int solution(String S) {
        String[]str = S.split("[.?!]");
        int max = 0;
        System.out.println("string1=" + str[1]);
        List<String> list = new ArrayList<String>();
        for(int i = 0; i < str.length; i++){
            str[i] = str[i].trim();
            //String[] x = str[i].split(" ");

            int n = str[i].split("\\s+").length;
            System.out.println("split=" + Arrays.toString(str[i].split("\\s+")));
            System.out.println("n is =" + n);
           if (max < n) {
               max = n;
           }
        }
        return max;
    }
}
