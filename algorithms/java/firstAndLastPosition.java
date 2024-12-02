class Solution {
    public int[] searchRange(int[] nums, int target) {
       int position[] = {-1,-1};


       for(int i = 0; i < nums.length; i++){
           if(position[0] == -1 && target == nums[i]){
               position[0] = i;
           }
           if(target == nums[i]){
               position[1] = i;
           }
       }

       return position;
    }
}