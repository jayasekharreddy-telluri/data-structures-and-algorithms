package org.com.jai.pattrens.dp;

public class MinimumDeletionsToMakeAStringPalindrome {

    public static int minDeletionsToMakeStringPalindrome(String str) {

        if (str == null || str.length() == 0) {

            return 0;
        }

        return str.length() - lpsBottom(str, str.length());

    }

    private static int lpsBottom(String str, int length) {

        int[][] arr = new int[length][length];

        for (int i = 0; i < str.length(); i++) {

            arr[i][i] = 1;
        }

        for (int i = length - 2; i >= 0; i--) {

            for (int j = i + 1; j < length; j++) {

                if (str.charAt(i) == str.charAt(j)) {

                    arr[i][j] = 2 + arr[i + 1][j - 1];
                } else {

                    arr[i][j] = Math.max(arr[i + 1][j], arr[i][j - 1]);
                }
            }
        }

        return arr[0][length - 1];

    }

    public static void main(String[] args) {

        String str = "abeba";

        System.out.println(minDeletionsToMakeStringPalindrome(str));

    }
}
