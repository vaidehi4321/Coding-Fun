package a.package1;

import java.util.Arrays;
import java.util.List;

public class Anagram {
    public static List<String> funWithAnagrams(List<String> text) {
    for(int i = 0; i < text.size()-1; i++) {
        for (int j = i + 1; j < text.size(); j++) {
          char[]x = text.get(i).toCharArray();
          Arrays.sort(x);
          String x1 = new String(x);
            char[]y = text.get(j).toCharArray();
            Arrays.sort(y);
            String y1 = new String(y);
            if(x1.equals(y1)){
                text.remove(y1);
            }
        }

        }
    return text;
    }

}
