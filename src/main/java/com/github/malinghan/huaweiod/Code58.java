package com.github.malinghan.huaweiod;

import java.util.Arrays;
import java.util.Scanner;

public class Code58 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int b = in.nextInt();
            int[] arr = new int[a];
            for(int i = 0 ; i < a; i++) {
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);
            for(int i = 0 ; i < b; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
