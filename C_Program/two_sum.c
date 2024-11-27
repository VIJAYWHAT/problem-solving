#include <stdio.h>
#include <stdlib.h>

int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
   
    int* result = (int*)malloc(2 * sizeof(int));
    
    for (int i = 0; i < numsSize; i++) {
        for (int j = i + 1; j < numsSize; j++) {
            if (nums[i] + nums[j] == target) {
                result[0] = i;
                result[1] = j;
                
                *returnSize = 2;
                
                return result;
            }
        }
    }
    
    *returnSize = 0;
    return NULL;
}

int main() {
    int nums[] = {2, 7, 11, 15};
    int target = 9;
    int numsSize = sizeof(nums) / sizeof(nums[0]);

    int returnSize = 0;

    int* result = twoSum(nums, numsSize, target, &returnSize);

    if (result != NULL) {
        printf("Output: [%d, %d]\n", result[0], result[1]);
        
        free(result);
    } else {
        printf("No solution found.\n");
    }

    return 0;
}


// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.