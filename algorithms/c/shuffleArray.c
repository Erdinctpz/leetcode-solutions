int* shuffle(int* nums, int numsSize, int n, int* returnSize){
    *returnSize=numsSize;
    int *shuffle=malloc(numsSize*sizeof(int));

    for(int i=0,k=0; i<n; i++,k+=2){
        *(shuffle+k)=nums[i];
        *(shuffle+k+1)=nums[i+(n)];
    }

    return shuffle;
}