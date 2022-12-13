package array;

public class SubArraySumOfValue {
    public static void main(String[] args) {

        int[] arr = {1,1,1};

        int k=2;
        int n=arr.length;
        int result=0;

        for(int i=0; i<n; i++){
           int sum = 0;
            int j;
            for(j = i; j<n; j++){
                sum += arr[j];
                if(sum == k) {
                    result++;
                }
           }
        }
        System.out.print(" Sum of value : "+k+" is "+result);
    }
}
