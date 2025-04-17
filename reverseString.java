import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String s = scanner.nextLine();
        s = reverseString(s);
        System.out.println(s);
        scanner.close();
    }

    public static String reverseString(String chars) {
        char[] s = chars.toCharArray();
        int right = 0;
        int left = s.length - 1;
        while (right < left) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            right++;
            left--;
        }
        return new String(s);
    }
}

// or

/*
 * public class reverseString {
 * public static void main(String[] args) {
 * Scanner scanner = new Scanner(System.in);
 * System.out.print("Enter a string to reverse: ");
 * String s = scanner.nextLine();
 * s = reverseString(s);
 * System.out.println(s);
 * scanner.close();
 * }
 *
 * public static String reverseString(String chars) {
 *
 * return new StringBuilder(chars).reverse().toString();
 * }
 * }
 *
 */