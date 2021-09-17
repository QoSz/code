class Main {

    public boolean isPalindrome(String input) {
        if (input.length() == 0 || input.length() == 1) {
            return true;
        }

        if (input.charAt(0) == input.charAt(input.length() - 1)) {
            return isPalindrome(input.substring(1, input.length() - 1));
        }

        return false;
    }

    public static void main(String[] args) {
        Main input = new Main();

        System.out.println(input.isPalindrome("RACEcar".toLowerCase()));
    }
}