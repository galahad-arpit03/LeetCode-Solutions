public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int num) {
        
      int result = 0, temp = num,bit;
        for (int i = 0; i <= 31; i++) {

            bit = (temp >> i) & 1;
             result = result | (bit << (31 - i));
        
    }

     return result;
    }
}