package ArrayList;

public class PushZeroToEnd {
    static void pushZerosToEndNative(int[] arr) {
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (arr[j] == 0){
                    int temp = arr[i];

                }
            }
        }
    }
    public static void main(String[] args) {
        int []  arr={1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEndNative(arr);
    }
}
