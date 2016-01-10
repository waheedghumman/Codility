
/**
 *
 * @author waheedghumman
 */
/*
Solution: According to problem’s condition, a passing car pair can only
be formed like (0,1). It means number of 1s after a particular 0 value
are the number of passing car pairs that can be formed with this 0.
Total number of 1s is counted in first for loop and when a 0 is found
the total number of 1s found so far is put at the A[number of zeros
found so far]. In the end (after first for loop), the A array contains
the zeros number of values i.e.
if initial array was:
A = [0, 1, 0, 1, 1]
then after first for loop:
max = 3 and zeros =2 and new A is
A = [0, 1, …..] (we now care A up to zero number of values) then every
value in new A is subtracted from Max and added to total. Intuitively
it means that we are getting number of maximum passing pairs that can
be formed with that 0.
Note: This solution gave 100% marks.
*/
class PassingCars {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int max = 0;
        int zeros = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 1) {
                max += 1;
            } else if (A[i] == 0) {
                A[zeros] = max;
                zeros += 1;
            }
        }
        int total = 0;
        for (int i = 0; i < zeros; i++) {
            total = total + (max - A[i]);
        }

        if (total <= 1000000000 && total >= 0) {
            return total;
        } else {
            return -1;
        }
    }
}
