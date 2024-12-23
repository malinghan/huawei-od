package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code69 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int[][] A = new int[x][y];
        int[][] B = new int[y][z];
        int[][] C = new int[x][z];

        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {
                A[i][j] = in.nextInt();
            }
        }

        for(int i = 0; i < y; i++) {
            for(int j = 0; j < z; j++) {
                B[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < z; j++) {
                for (int k = 0; k < y; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
                System.out.print(C[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
