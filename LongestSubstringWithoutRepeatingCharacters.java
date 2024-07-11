//For s = "qywrryy". The longest substring without repeating characters is "abc", which has a length of 3.

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0;
        int[] arr;
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            if (map.containsKey(currentChar)) {
                start = Math.max(map.get(currentChar) + 1, start);
            }

            map.put(currentChar, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "qywrryy";
        int maxLength = lengthOfLongestSubstring(s);
        System.out.println("Length of longest substring without repeating characters: " + maxLength);
    }
}
