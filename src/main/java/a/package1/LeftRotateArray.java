package a.package1;

import java.util.ArrayList;
import java.util.Arrays;
   /*you have given an array and number d = number of rotations to be performed
     1 <= d <= array.length;
   */

public class LeftRotateArray {
    public int[] leftRotate(int[]arr,int d){
        int j=0;
        int[]rotated=new int[arr.length];
        for(int i =d; i < arr.length; i++){
            rotated[j]=arr[i];
            j++;
        }
       // System.out.println(Arrays.toString(rotated));
        j=arr.length-d;
        for(int i = 0; i<=d-1; i++){
            rotated[j]=arr[i];
            j++;
        }
        System.out.println(Arrays.toString(rotated));
        return rotated;
    }
}
