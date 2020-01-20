package a.package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxProductTriplet {
    public Integer find(Integer[] arr) {
        int maxProduct=Integer.MIN_VALUE;
        switch (arr.length) {
            case 0: {
                maxProduct = 0;
                break;
            }
            case 1: {
                maxProduct = arr[0];
                break;
            }
            case 2: {
                maxProduct = arr[0] * arr[1];
                break;
            }


            default: {
                for (int i = 0; i < arr.length - 2; i++) {
                    for (int j = i + 1; j < arr.length - 1; j++) {
                        for (int k = j + 1; k < arr.length; k++) {
                            int product = arr[i] * arr[j] * arr[k];
                            if (product > maxProduct) {
                                maxProduct = product;
                            }

                        }
                    }

                }
            }

        }
        return maxProduct;
    }
}