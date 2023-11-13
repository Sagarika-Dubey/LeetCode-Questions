import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        Palindrome palindrome = new Palindrome();

        boolean res = palindrome.isPalindrome(number);
        System.out.println(res);

    }

    public boolean isPalindrome(int x) {

        int rev = 0;
        int temp = x;
        while (temp > 0) {
            int mod = temp % 10;
            rev = rev * 10 + mod;
            temp = temp / 10;
        }
        if (x == rev) {
            return true;
        }

        return false;

    }
}
