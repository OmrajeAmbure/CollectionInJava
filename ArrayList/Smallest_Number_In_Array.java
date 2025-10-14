package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Smallest_Number_In_Array {
        public int min1 = Integer.MAX_VALUE;
        public int min2 = Integer.MAX_VALUE;
        public  ArrayList<Integer> ans = new ArrayList<>();
        public ArrayList<Integer> minAnd2ndMin(int[] arr) {
            for(int i=0;i<arr.length;i++){
                if(arr[i] < min1){
                    min1 = arr[i];
                }
            }
            for (int i=0;i< arr.length;i++){
                if (arr[i] < min2){
                    if (arr[i] == min1){
                        continue;
                    }
                    min2 = arr[i];
                }
            }
            if (min1 != Integer.MAX_VALUE && min2 != Integer.MAX_VALUE){
                ans.add(min1);
                ans.add(min2);
            }else {
                ans.add(-1);
            }
            return ans;
        }
        public ArrayList<Integer> minAnd2ndMinImproveTime(int[] arr){
            if (arr.length < 2){
                ans.add(-1);
                return ans;
            }
            for (int i:arr){
                if (i<min1){
                    min2 = min1;
                    min1 = i;
                }else if (i<min2 && i!=min1){
                    min2 = i;
                }
            }
            if (min2 == Integer.MAX_VALUE){
                ans.add(-1);
            }else {
                ans.add(min1);
                ans.add(min2);
            }
            return ans;
        }
        public static void main(String[] args) {
            Smallest_Number_In_Array sm  = new Smallest_Number_In_Array();
//            ArrayList ans1 = sm.minAnd2ndMin(new int[]{2,4,3,5,6});
            ArrayList ans2 = sm.minAnd2ndMinImproveTime(new int[]{2,4,3,5,6});
//            System.out.println(ans1);
            System.out.println(ans2);
        }
}
