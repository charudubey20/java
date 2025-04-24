// Given a string, find the first non-repeating character in it.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter  string: ");
        String t = scanner.nextLine();
        int result = firstNonRepeatingCharacter(t);
        if (result != -1) {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
         }
        scanner.close();
    }

    public static int firstNonRepeatingCharacter(String s) {
        // int[] count = new int[26];
        // for (int i = 0; i < s.length(); i++) {
        // count[s.charAt(i) - 'a']++;
        // }
        // for (int i = 0; i < s.length(); i++) {
        // if (count[s.charAt(i) - ' ] == 1) {
        // return i;
        // }
        // }
        Map<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

}
