package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        int p = 1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i+1; j++) {
                //找规律
                matrix[i-j][j] = p;
                p++;
            }
        }
        for(int l = 0 ; l < n; l++) {
            for(int r = 0 ; r < n; r++) {
                if(matrix[l][r] != 0) {
                    System.out.print(matrix[l][r] + " ");
                }
            }
            System.out.println("");
        }
    }
}
