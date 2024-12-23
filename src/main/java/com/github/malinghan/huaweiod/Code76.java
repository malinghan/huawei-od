package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code76 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        //while (in.hasNextInt()) { // 注意 while 处理多个 case
        int a = in.nextInt();
        int total = a * a * a;
        for(int i = 1; i < total; i += 2) {
            int sum = 0;
            int[] res = new int[a];
            for(int j = 0; j < a; j++) {
                res[j] = i + 2 * j;
                sum += res[j];
            }
            if (sum == total) {
                for (int k = 0; k < a; k ++) {
                    if (k != a-1) {
                        System.out.print(res[k]+ "+");
                    } else {
                        System.out.print(res[k]);
                    }
                }
                break;
            }
        }

        System.out.println();
    }
}
