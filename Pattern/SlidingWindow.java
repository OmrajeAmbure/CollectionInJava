package Pattern;

public class SlidingWindow {
   public static int maxOfSubArray(int arr[],int k){
       int current = 0;
        for(int i=0;i<k;i++){
            current += arr[i];
        }
        int maxx = current;
        for (int i=1;i<arr.length - k;i++){
            current = current - arr[i-1] + arr[i+k-1];
            if (current>maxx){
                maxx = current;
            }
        }
        return maxx;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int k = 3;
        System.out.println(maxOfSubArray(arr,k));
    }
}
