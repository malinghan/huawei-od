package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code97 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            int[] ar = new int[n];
            for(int i =0; i< n; i++) {
                ar[i] = in.nextInt();
            }
            int fu = 0;
            int zheng = 0;
            int countPositive = 0;
            double average = 0.00;
            for (int i = 0; i < n; i++) {
                if (ar[i] < 0) {
                    fu ++;
                } else if (ar[i] > 0) {
                    zheng += ar[i];
                    countPositive++;
                }
            }
            average = countPositive == 0 ? 0.0 : zheng * 1.0 / countPositive;
            System.out.println(fu + " " + String.format("%.1f", average));
        }
    }
}
