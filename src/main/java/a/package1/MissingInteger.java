package a.package1;

import java.util.Arrays;

public class MissingInteger {
    int n=1;
    public int missingInteger(int[] A) {
        Arrays.sort(A);
        if (A[A.length -1] < 1) return n;
        if (A.length == 1) return (A[0] + 1);
        for (int i=0;i<A.length-1;i++){
            if (A[i+1]-A[i]>1) {
                return A[i]+1;
            }
        }
        return A[A.length-1]+1;
    }
}
