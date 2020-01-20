package a.package1;

public class RightRotate {

    public int[] rightRotate(int[] A, int k) {
        int[] B = new int[A.length];
        int len =  A.length;
        if (len == 0){
            return A;
        }

        if (k % len == 0){
            return A;
        }

        if (k > len){
            k =  k % len;
        }

        int j=0;
        for (int i = len-k; i < len; i++){
            B[j] = A[i];
            j++;
        }

        for ( int m = 0 ; m < len-k; m++){
            B[j] = A[m];
            j++;
        }
        return B;
    }

}

