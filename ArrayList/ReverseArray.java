package ArrayList;

public class ReverseArray {
//    public static void reverseInGroups(int[] arr, int k){
//        int start = 0;
//        int end = arr.length - k;
//        while (start < end) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//        for (int i:arr){
//            System.out.print(i);
//        }
//    }
    public static void reverseInGroups(int[] arr, int k) {
            // code here
            for (int i=0;i<arr.length;i+=k){
                int start = i;
                int end = Math.min(i + k - 1,arr.length - 1);
                while (start<end){
                    int temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
                }
            }

            for (int i:arr){
                System.out.print(i);
            }
    }

    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8};
        int k = 3;
        reverseInGroups(arr,k);
    }
}
