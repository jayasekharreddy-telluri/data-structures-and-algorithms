package org.com.jai.pattrens.dp.dp;

public class LongestCommonSubsequence {

    public static int findLcs(String s1, String s2, int n, int m) {

        if (n == 0 || m == 0) {

            return 0;
        }

        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {

            return 1 + findLcs(s1, s2, n - 1, m - 1);
        }

        return Math.max(findLcs(s1, s2, n - 1, m), findLcs(s1, s2, n, m - 1));

    }

    public static int lcsTopDown(String s1, String s2, int n, int m, Integer[][] arr) {

        if (n == 0 || m == 0) {

            return 0;
        }

        if (arr[n][m] == null) {

            if (s1.charAt(n - 1) == s2.charAt(m - 1)) {

                arr[n][m] = 1 + lcsTopDown(s1, s2, n - 1, m - 1, arr);

            } else {

                arr[n][m] = Math.max(lcsTopDown(s1, s2, n, m - 1, arr), lcsTopDown(s1, s2, n - 1, m, arr));
            }

        }

        return arr[n][m];
    }


    public static int lcsBottomUp(String s1, String s2, int n, int m) {

        if (n == 0 || m == 0) {

            return 0;
        }

        int[][] arr = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {

                    arr[i][j] = 1 + arr[i - 1][j - 1];

                } else {

                    arr[i][j] = Math.max(arr[i][j - 1], arr[i - 1][j]);
                }

            }
        }

        return arr[n][m];
    }

    public static void main(String[] args) {

        String s1 = "abde";
        String s2 = "acd";

        System.out.println(findLcs(s1, s2, s1.length(), s2.length()));

        Integer[][] arr = new Integer[s1.length() + 1][s2.length() + 1];
        System.out.println(lcsTopDown(s1, s2, s1.length(), s2.length(), arr));

        System.out.println(lcsBottomUp(s1, s2, s1.length(), s2.length()));
    }
}
