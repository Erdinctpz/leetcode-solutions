class Solution {
    public int[] shuffle(int[] nums, int n) {
        int shuffled[] = new int[nums.length];
        for(int i=0,j=n,k=0; j<nums.length; i++,j++,k+=2){
            shuffled[k] = nums[i];
            shuffled[k+1] = nums[j];
        }
    return shuffled;
    }
}
