void merge(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n){
    if(m==1 && n==0){
            return;
        }
        else if(m+n>0){
        for(int i=m,j=0; i<m+n; i++,j++){
            if(nums2[j]!=0){
                nums1[i]=nums2[j];
            }
        }
        for(int i=0; i<m+n-1; i++){
            for(int j=0; j<m+n-1; j++){
                if(nums1[j]>nums1[j+1]){
                  int hold=nums1[j];
                  nums1[j]=nums1[j+1];
                  nums1[j+1]=hold;  
                }
            }
        }
    }
}