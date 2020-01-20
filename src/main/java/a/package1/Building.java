package a.package1;

import java.util.Arrays;

public class Building {

    public int solution(int[] A) {
        int count = 0;
        //int[] B = new int[A.length]
        int largestNumber = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > largestNumber) {
                largestNumber = A[i];
            }
        }

        int strokeCount = 0;
        for (int i = 0; i <= largestNumber; i++) {
            boolean highestMatch = false;
            for (int j = 0; j < A.length; j++) {
                if (!highestMatch && A[j] >= (i + 1)) {
                    strokeCount++;
                    highestMatch = true;
                } else {
                    if (highestMatch && A[j] < (i + 1)) {
                        highestMatch = false;
                    }
                }
            }
        }
        if (strokeCount > 1000000000) {
            return -1;
        } else {
            return strokeCount;
        }

    }
}
