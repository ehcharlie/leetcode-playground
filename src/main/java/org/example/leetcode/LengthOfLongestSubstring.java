package org.example.leetcode;

public class LengthOfLongestSubstring {

    public static int example(String s) {
        if (!s.isBlank()) {
            char[] characters = s.toCharArray();

            String longest = "";
            for (int i = 0; i < s.length() - 1; i++) {
                String current = String.valueOf(characters[i]);

                if (longest.isEmpty()) {
                    longest = current;
                }

                for (int j = i + 1; j < s.length(); j++) {
                    if (!current.contains(String.valueOf(characters[j]))) {
                        current += (characters[j]);

                        if (current.length() > longest.length()) {
                            longest = current;
                        }
                    } else {
                        break;
                    }
                }
            }

            return longest.length();
        }

        return 0;

    }
}