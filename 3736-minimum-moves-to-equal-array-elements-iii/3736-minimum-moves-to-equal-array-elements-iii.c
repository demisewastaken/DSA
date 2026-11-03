#include <limits.h>
#include <math.h>
#include <stdlib.h>
int minMoves(int* nums, int numsSize) {
    int max = INT_MIN;
    for (int i = 0; i < numsSize; i++) {
        if (max < *(nums + i)) {
            max = *(nums + i);
        }
    }

    int moves = 0;
    for (int i = 0; i < numsSize; i++) {
        moves += abs(max - *(nums + i));
    }
    return moves;
}