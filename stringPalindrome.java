import java.util.Scanner;

public class stringPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to cehck if its pallindrome or not:  ");
        String s = scanner.nextLine();
        if (isPalindrome(s)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        System.out.println(s);
        scanner.close();
    }

    public static boolean isPalindrome(String chars) {
        char[] s = chars.toCharArray();
        int right = 0;
        int left = s.length - 1;
        for (int i = 0; i < s.length / 2; i++) {
            if (s[left] != s[right]) {
                return false;
            } else {
                left--;
                right++;
            }
        }
        return true;

    }
}
 // OR

 /*
  *  public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
  */