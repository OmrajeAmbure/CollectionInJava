package Collection.Collection;

import java.util.HashSet;

public class Solution {
    public static boolean containsDuplicate(int[] nums) {
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean containsDuplicateHashing(int[] nums) {
        if (nums.length == 0){
            return false;
        }
        HashSet<Integer> num = new HashSet<>();
        for (int i:nums){
            if (!num.add(i)){
                return true;
            }
        }
        return false;
    }

    public boolean isAnagram(String s, String t) {
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        boolean ans = containsDuplicate(arr);
        System.out.println(ans);
    }
}
