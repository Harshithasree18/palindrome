public class PalindromeNumber {
    public boolean isPalindrome(int number) {
        if (number < 0) return false;
        int original = number;
        long reversed = 0;
        int n = number;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        System.out.println(new PalindromeNumber().isPalindrome(121));
    }
}
