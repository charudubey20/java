// Given a string, find the length of the longest substring without repeating
// characters.

import java.util.HashSet;
import java.util.Scanner;

public class longestSubstring {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String s = scanner.nextLine();
    int length = longestSubstrings(s);
    System.out.println("The length of the longest substring without repeating characters is:" + length);
    scanner.close();
  }

  public static int longestSubstrings(String s) {
    int left = 0, maxLength = 0;
    HashSet<Character> set = new HashSet<>();
    for (int right = 0; right < s.length(); right++) {
      while (set.contains(s.charAt(right))) {
        set.remove(s.charAt(left));
        left++;
      }
      set.add(s.charAt(right));
      if ((right - left + 1) > maxLength) {
        maxLength = right - left + 1;
      }

    }

    return maxLength;
  }
}