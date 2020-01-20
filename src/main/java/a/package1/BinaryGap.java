package a.package1;

import java.util.Arrays;

//binary gap is the number of zeroes between two 1's in binary representation of number
public class BinaryGap {
     public int solution(int N){


        String Nstring = Integer.toString(N,2);
        char[] arr = Nstring.toCharArray();
        int maxCount = 0;
         int currentCount = 0;
         Boolean flag = false;
        for (int i = 0; i < arr.length; i++){
           if(arr[i] == '0'){
               if(flag == true){
                   currentCount++;
               }

           }
           else if(arr[i] == '1'){
               flag = true;
               if(currentCount > maxCount){
                   maxCount = currentCount;
                   currentCount = 0;
               }
               else
                   currentCount = 0;
           }
        }
        System.out.println(Nstring);
         return maxCount;
     }
}



//class Solution {
//    public int solution(int N) {
//        // write your code in Java SE 8
//        String Nstring = Integer.toBinaryString(N);
//        Boolean flag = false;
//        int currentCount = 0;
//        int maxCount = 0;
//        for(int i = 0; i < Nstring.length(); i++){
//            if(Nstring.charAt(i)=='0'){
//                if(flag == true){
//                    currentCount++;
//                }
//
//            }
//            else if(Nstring.charAt(i) == '1'){
//                flag = true;
//                if(currentCount > maxCount){
//                    maxCount = currentCount;
//                    currentCount = 0;
//                }
//                else{
//                    currentCount = 0;
//                }
//            }
//
//        }
//        return maxCount;
//    }
//}
//
//
