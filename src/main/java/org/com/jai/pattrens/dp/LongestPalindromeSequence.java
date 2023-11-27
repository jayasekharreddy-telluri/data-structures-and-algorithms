package org.com.jai.pattrens.dp;

public class LongestPalindromeSequence {

    public static int lps(String s1,int start,int end){

        if (start > end){

            return 0;
        }

        if (start == end){

            return 1;
        }

        if (s1.charAt(start) == s1.charAt(end)){

            return 2 + lps(s1,start + 1,end-1);
        }

        return Math.max(lps(s1,start +1,end),lps(s1,start,end-1));
    }

    public static int lpsTopDown(String s1,int start,int end,Integer[][] arr){

        if (start > end){

            return 0;
        }

        if (start == end){

            return 1;
        }

        if (arr[start][end] == null){

            if (s1.charAt(start) == s1.charAt(end)){

                arr[start][end] = 2 + lpsTopDown(s1,start+1,end-1,arr);
            }else{

                arr[start][end] = Math.max(lpsTopDown(s1,start+1,end,arr),lpsTopDown(s1,start,end-1,arr));
            }

        }

        return arr[start][end];

    }

    public static int lpsBottomUp(String s1,int n){

        Integer[][] arr = new Integer[n][n];

        for (int i = 0; i < s1.length();i++){

            arr[i][i] = 1;
        }

        for (int i = n-2; i >=0; i--){

            for (int j = i + 1; j < n; j++){

                if (s1.charAt(i) == s1.charAt(j)){

                    arr[i][j] = 2 + arr[i + 1][j-1];
                }else{

                    arr[i][j] = Math.max(arr[i + 1][j],arr[i][j-1]);
                }
            }
        }

        return arr[0][n-1];

    }

    public static void main(String[] args) {

        String str = "aba";

        System.out.println(LongestPalindromeSequence.lps(str, 0, str.length() - 1));

        Integer[][] arr = new Integer[str.length()][str.length()];
        System.out.println(LongestPalindromeSequence.lpsTopDown(str, 0, str.length() - 1, arr));

        System.out.println(lpsBottomUp(str, str.length()));
    }
}
