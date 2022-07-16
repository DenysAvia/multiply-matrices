package com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {

        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;
        int i, j, k;


            // Check if multiplication is Possible
            if (row2 != col1) {

                System.out.println(
                        "\nMultiplication Not Possible");
                return null;
            }

            int resArr[][] = new int[row1][col2];


            for (i = 0; i < row1; i++) {
                for (j = 0; j < col2; j++) {
                    for (k = 0; k < row2; k++)
                        resArr[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }

        return resArr;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] a = {
                {0, 12345},
                {4509, 0},
                {3, 567} };

        int[][] b = {
                {653, 0, 25353},
                {0, 61, 6} };

        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
