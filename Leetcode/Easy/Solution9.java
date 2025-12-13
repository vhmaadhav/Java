package Leetcode.Easy;

public class Solution9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {return true;}

        int temp = x;
        int reverse = 0;

        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }

        return x == reverse;
    }

    
}

