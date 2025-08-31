// Problem 1: First Recurring Character in a String
// Company: Google

import java.util.*;

public class FirstRecurringCharacter {
    public static String firstRecurring(String s) {
        Set<Character> seen = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (seen.contains(c)) {
                return String.valueOf(c);
            }
            seen.add(c);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstRecurring("acbbac")); // b
        System.out.println(firstRecurring("abcdef")); // null
        System.out.println(firstRecurring("abca"));   // a
    }
}
