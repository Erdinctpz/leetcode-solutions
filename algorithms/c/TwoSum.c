int* twoSum(int* nums, int numsSize, int target, int* returnSize){

*returnSize=2;
int *vals=malloc((*returnSize)*sizeof(int));

for(int i=0; i<numsSize-1; i++) 
    for(int j=i+1; j<numsSize; j++)
        if(target==nums[i]+nums[j])
        {
            *vals=i;
            *(vals+1)=j;
        }

return vals;
}