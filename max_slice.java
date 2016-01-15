// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int len = A.length;
        int largest = A[0];
        int last = largest;
        for(int i=1;i<len;i++) {
            last = Math.max(A[i],A[i]+last);
            if(last>largest){
                largest = last;
            }
        }
        return largest;
    }
}