package playsAndStuff;

public class Palindrome {
    public static boolean isPalindrome(int numbers){
        int reverse = 0;
        int palindrome = 0;
        int next = numbers;
        for (int count = 0; count < 4; count++) {
            reverse = numbers % 10;
            palindrome = palindrome * 10 + reverse;
            numbers /= 10;
        }
        if ( palindrome == next){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1331));
    }

}
