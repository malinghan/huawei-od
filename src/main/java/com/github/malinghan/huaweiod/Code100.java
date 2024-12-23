package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            int sum = 0;
            for(int i = 0 ; i < n; i++) {
                sum += 2 + 3 * i;
            }
            System.out.println(sum);
        }
    }
}
