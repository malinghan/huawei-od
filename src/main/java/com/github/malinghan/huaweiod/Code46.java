package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code46 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String s = in.nextLine();
            int k = in.nextInt();
            System.out.println(s.substring(0, k));
        }
    }
}
