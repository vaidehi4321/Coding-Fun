package a.package1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NdiscIntersection {
    public Integer findIntersectingPairs(Integer[] arr) {
//        Integer result = 0;
//
//        for(int i = 0; i < arr.length-1; i++){
//            for (int j = i+1; j < arr.length; j++){
//               int d =  Math.abs(i-j);
//             if(d <= arr[i]+arr[j]){
//                 result=result+1;
//             }
//            }
//        }
//
//        if(result > 10000000){result = -1;}
//
//
//        return result;
//    }
        {
            int cnt = 0;
            int i, j;

            for (i = 0; i < arr.length - 1; i++) {
                //here curl is curve at left and curr is curve at right
                long curl = (long) i - arr[i];
                long curr = (long) i + arr[i];

                for (j = i + 1; j < arr.length; j++) {
                    //here posl is position at left and posr is position at right
                    long posl = (long) j - arr[j];
                     long posr = (long) j + arr[j];

                    if (posl <= curr && curl <= posr) {
                        cnt++;
                        if (cnt > 10000000) {
                            return -1;
                        }
                    }
                }
            }
            return cnt;
        }
    }
}