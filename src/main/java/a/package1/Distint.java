package a.package1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Distint {
    public Integer numOfDistinct(Integer[]arr){
        Set<Integer> set = new LinkedHashSet<Integer>();
        for (Integer t : arr){
            set.add(t);
        }
        return set.size();
    }
}
