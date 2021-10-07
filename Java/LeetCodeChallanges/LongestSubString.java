public class LongestSubString {

    public int lengthOfLongestSubstring(String s) {
        int number = 0;

        if (s == "") {
            number = 0;
        }

        return number;
    }

    public static void main(String[] args) {
        LongestSubString l = new LongestSubString();
        int length = l.lengthOfLongestSubstring("");

        System.out.println(length);
    }

}
