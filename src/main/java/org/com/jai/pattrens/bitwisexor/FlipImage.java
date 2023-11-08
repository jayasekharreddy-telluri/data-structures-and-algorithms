package org.com.jai.pattrens.bitwisexor;

public class FlipImage {

    public static void flipImageAndInvert(int[][] arr){

        // Get the number of columns in the array
        int c = arr[0].length;

        // Iterate through each row of the array
        for (int[] row : arr){

            // Iterate only through the first half of each row
            for (int i = 0; i < (c + 1) / 2; ++i){

                // XOR operation to invert the value and swap values symmetrically across the row
                int temp = row[i] ^ 1;
                row[i] = row[c - 1 - i] ^ 1;
                row[c - 1 - i] = temp;
            }
        }
        /*
            Time Complexity: O(N * M) where N is the number of rows and M is the number of columns in the array.
            Space Complexity: O(1) - The algorithm uses a constant amount of extra space.
         */
    }

    public static void print(int[][] arr){

        // Print the contents of the 2D array
        for (int i = 0; i < arr.length; i++){

            for (int j = 0; j < arr[0].length; j++){

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Given 2D array
        int[][] arr = {{1, 0, 1}, {1, 1, 1}, {0, 1, 1}};

        // Flip the image and invert values
        flipImageAndInvert(arr);

        // Print the modified 2D array
        print(arr);
    }
}
