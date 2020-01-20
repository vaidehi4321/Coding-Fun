package a.package1;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
    public Integer checkTriangle(Integer[]arr){

       Integer result = 0;
        if(arr.length<3)
            result =  0;
        else{
            for(int i = 0; i < arr.length-2; i++){
                for(int j = i+1; j < arr.length-1; j++){
                  for(int k = j+1 ; k < arr.length; k++){
                      if ( (arr[i]+arr[j] > arr[k]) && (arr[i]+arr[k] > arr[j]) && (arr[k]+arr[j] > arr[i])) {
                          result = 1;
                          break;
                      }
                  }
                }
            }
        }
        return result;
    }
}
