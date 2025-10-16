package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateElement {
        public static ArrayList<Integer> findDuplicates(int[] arr) {
            HashSet<Integer> set = new HashSet<>();
            ArrayList<Integer> ans = new ArrayList<>();
            /**
             *  Adds the specified element to this set if it is not already present
             *  Note :-  backed by a hash table (actually a HashMap instance). It makes no guarantees as to the iteration order of the set; in particular, it does not guarantee that the order will remain constant over time.
             *   Time complexity ---> O(n)
             *   Space complexity ----> O(n)
             **/
            for (int i:arr){
                if (set.add(i) != true){
                    ans.add(i);
                }
            }
            return ans ;
        }
        /**
         *    1. init empty ans list
         *    2. Start With outer Loop 0 to n iterate
         *    2.  Start inner loop  outerLoop +1  to n iterate
         *    3.  if  arr[outerLoop] == arr[innerLoop ] ans.add(arr[outerLoop])
         *    4. continue until all duplicate are stored in ans
         *    5. return the ans
         *    Time complexity ---> O(n^2)
         *    Space complexity ----> O(n)
        **/
        public static ArrayList<Integer> findDuplicatesNative(int[] arr) {
        // code here
            ArrayList<Integer> ans = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                for (int j=i+1;j<arr.length;j++){
                    if (arr[i] == arr[j]){
                        ans.add(arr[i]);
                    }
                }
            }
            return ans;
        }
    public static void main(String args[]) {
            int arr[] = {1,2,3,4,5,6,7,1,2};
            System.out.println(findDuplicatesNative(arr));
            System.out.println(findDuplicates(arr));
    }
}

