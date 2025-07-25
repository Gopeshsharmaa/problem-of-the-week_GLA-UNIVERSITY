//Brute-force solution to find the LCS of three strings.

import java.util.*;

public class LCSOfThreeBruteForce {

    // Check if 'sub' is a subsequence of 'str'
    public static boolean isSubsequence(String sub, String str) {
        int i = 0, j = 0;
        while (i < sub.length() && j < str.length()) {
            if (sub.charAt(i) == str.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == sub.length();
    }

    // Generate all subsequences of a string
    public static void generateSubsequences(String s, int index, String curr, List<String> result) {
        if (index == s.length()) {
            result.add(curr);
            return;
        }
        // Include current character
        generateSubsequences(s, index + 1, curr + s.charAt(index), result);
        // Exclude current character
        generateSubsequences(s, index + 1, curr, result);
    }

    public static int bruteLCS(String a, String b, String c) {
        List<String> subsequences = new ArrayList<>();
        generateSubsequences(a, 0, "", subsequences);

        int maxLen = 0;
        for (String sub : subsequences) {
            if (isSubsequence(sub, b) && isSubsequence(sub, c)) {
                maxLen = Math.max(maxLen, sub.length());
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().trim();
        String s2 = sc.nextLine().trim();
        String s3 = sc.nextLine().trim();

        int result = bruteLCS(s1, s2, s3);
        System.out.println(result);
    }
}



//Efficient solution to find the Longest Common Subsequence (LCS)

import java.util.Scanner;

public class LCSOfThreeDP {

    public static int lcsOfThree(String a, String b, String c) {
        int n1 = a.length();
        int n2 = b.length();
        int n3 = c.length();

        int[][][] dp = new int[n1 + 1][n2 + 1][n3 + 1];

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                for (int k = 1; k <= n3; k++) {
                    if (a.charAt(i - 1) == b.charAt(j - 1) && a.charAt(i - 1) == c.charAt(k - 1)) {
                        dp[i][j][k] = 1 + dp[i - 1][j - 1][k - 1];
                    } else {
                        dp[i][j][k] = Math.max(
                            dp[i - 1][j][k],
                            Math.max(dp[i][j - 1][k], dp[i][j][k - 1])
                        );
                    }
                }
            }
        }

        return dp[n1][n2][n3];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().trim();
        String s2 = sc.nextLine().trim();
        String s3 = sc.nextLine().trim();

        int result = lcsOfThree(s1, s2, s3);
        System.out.println(result);
    }
}
