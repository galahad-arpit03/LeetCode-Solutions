import java.math.*;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger x= new BigInteger(num1);
        BigInteger x1= new BigInteger(num2);
        return ""+x.multiply(x1);
    }
}