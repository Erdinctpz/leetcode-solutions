#include <stdio.h>
#include <stdlib.h>

double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int totalSize = nums1Size + nums2Size;
    int arr[totalSize];
    for(size_t i = 0, j = 0, k = 0; i<nums1Size || j < nums2Size; ++k){
        if(i < nums1Size)
            arr[k] = nums1[i++];
        else
            arr[k] = nums2[j++];

    }

    for(size_t i = 0; i < totalSize-1; ++i){
        for(size_t j = i+1; j < totalSize; ++j){
            if(arr[i] > arr[j]){
                int hold = arr[i];
                arr[i] = arr[j];
                arr[j] = hold;
            }
        }
    }

    if(totalSize % 2 != 0)
        return arr[totalSize / 2];
    else
        return (double)(arr[totalSize / 2 - 1] + arr[totalSize / 2]) / 2;
}