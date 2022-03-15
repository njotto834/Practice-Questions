class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] result = new int[2];
        int num1;
        int num2;
        for (int i = 0; i < length; i++){
            num1 = nums[i];
            for (int j = 1; j < length + 1; j++){
                if (j == length){
                    //If index j reaches length of the array, it wraps around and becomes 0.
                    j = 0; 
                }
                if (i == j){
                    //Indices i and j can never be at the same place in the array.
                    break;
                }
                num2 = nums[j];
                if ((num1 + num2) == target){
                    //If the sum of num1 and num2 is the target number, assign its indices i and j to the result array.
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}