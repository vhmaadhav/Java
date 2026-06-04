// Last updated: 6/4/2026, 7:25:41 PM
#include <stdlib.h>

int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    int* answer = (int*)malloc(2 * sizeof(int));
    *returnSize = 2;
    for (int i = 0; i < numsSize; i++) {
        for (int j = i + 1; j < numsSize; j++) {
            if (nums[i] + nums[j] == target) {
                answer[0] = i;
                answer[1] = j;
                return answer;
            }
        }
    }
    return NULL;
}

