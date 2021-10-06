public class PlaindromeNumber {

    public boolean isPalindrome(int x) {
        boolean isNumPalindrome = true;
        int input = x;
        int reverseNum = 0;

        if (x < 0) {
            return isNumPalindrome = false;
        }

        while (x != 0) {
            int digit = x % 10;
            reverseNum = reverseNum * 10 + digit;
            x = x / 10;
        }

        if (input == reverseNum) {
            isNumPalindrome = true;
        }

        else {
            isNumPalindrome = false;
        }

        return isNumPalindrome;

    }

    public static void main(String[] args) {
        PlaindromeNumber p = new PlaindromeNumber();
        boolean answer = p.isPalindrome(6666);
        System.out.println(answer);
    }
}
