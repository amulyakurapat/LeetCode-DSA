import java.math.*;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger n1 = new BigInteger (a, 2);
        BigInteger n2 = new BigInteger(b, 2);
        BigInteger num = n1.add(n2);
        return num.toString(2);

    }
}