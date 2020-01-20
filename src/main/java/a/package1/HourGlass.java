package a.package1;

public class HourGlass {
   public int hourglassSum(int[][] arr) {
        int max=Integer. MIN_VALUE;
        int sum=0 ;
        int n = arr.length;
        for(int i = 0; i<n-2 ;i++){
            for(int j = 0; j < n-2 ;j++){
                sum =arr[i][j]+arr[i][j+1]+arr[i][j+2]
                        +arr[i+1][j+1]
                        +arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                System.out.println(sum);
                if(sum>max){
                    max=sum;
                }
            }

        }
        System.out.println(max);
        return max;
    }

}
