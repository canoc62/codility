import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int length = A.length;
        int min = 0;
        int diff = 0;
        int temp = 0;
        int max_ending = 0;
        int max_slice = 0;
        
        for(int i =1; i < length; i++){
            diff = A[i] - A[i-1];
            temp = max_ending + diff;
            max_ending = temp < min ? min:temp;
            max_slice = max_slice < max_ending ? max_ending:max_slice;
        }
        return max_slice;
    }
}