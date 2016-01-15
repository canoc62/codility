// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int count = 0;
        int overallCount = 0;
        int ones = 0;
        while ( N > 0){
            if(N%2 == 1){
                ones++;
                count = 0;    
            }
            else if(N%2 == 0){
                 
                if(ones > 0){
                    count++; 
                    if(overallCount < count){
                        overallCount = count;    
                    }
                }
            }
            N = N/2;
        }
        return overallCount;
    }
}