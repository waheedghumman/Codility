// solution is simple for this problem,
// adjacent ropes are tied together until one rope becomes equal/greater than the limit K

class Solution {
    public int solution(int K, int[] A) {
        // write your code in Java SE 8
        int ropes = 0;
        int length = 0;
        for (int rope: A){
            length += rope;
            if (length >= K){
                ropes++;
                length = 0;
                }
            }
        return ropes;
    }
}
