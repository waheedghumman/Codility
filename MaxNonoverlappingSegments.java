// Solution is very simple and easy to understand.
// 100% score with java

class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        
        if (A.length <= 1){
            return A.length;
            }
        
        int maximal = 1;
        int end = B[0];
        
        for (int i = 1; i < A.length; i++){
            if (A[i] > end){
                end = B[i];
                maximal++;
                }
            }
        return maximal;
    }
}
