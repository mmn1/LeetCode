package palindromeNumber;

class Solution1 {
    public boolean isPalindrome(int x) {
                if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int secondHalf = 0;
        while (secondHalf < x) {
            secondHalf = secondHalf * 10 + x % 10;
            x /= 10;
        }

        return (secondHalf == x) || (secondHalf / 10 == x);
      
    }
}
