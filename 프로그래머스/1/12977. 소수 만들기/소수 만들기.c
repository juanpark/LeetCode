#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <math.h>

bool is_prime(int num) {
    if (num <= 1) return false;
    if (num == 2) return true;
    if (num % 2 == 0) return false;
    
    for (int i = 3; i <= sqrt(num); i += 2) {
        if (num % i == 0) return false;
    }
    return true;
}

// nums_len은 배열 nums의 길이입니다.
int solution(int nums[], size_t nums_len) {
    int answer = 0;
    
    for (int i = 0; i < nums_len - 2; i++) {
        for (int j = i + 1; j < nums_len -1; j++)
            for (int k = j + 1; k < nums_len; k++)
                if (is_prime(nums[i] + nums[j] + nums[k])) {
                    answer++;
                }
    }
        
    return answer;
}