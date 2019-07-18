package cf.a977;

/*
 * TODO description
 */

public class Solution {

    public long execute(long n, long k) {

        for (int i = 0; i < k; i++) {
            if (n % 10 != 0) {
                n--;
            } else {
                n = n/10;
            }
        }

        return n;
    }
}
