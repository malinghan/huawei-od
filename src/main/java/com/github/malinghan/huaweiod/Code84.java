package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code84 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String s = in.nextLine();
            int count = 0;
            for(char c: s.toCharArray()) {
                if (c >= 'A' && c <= 'Z') {
                    count++;
                }
            }
            System.out.println(s.replaceAll("[^A-Z]","").length());
            System.out.println(count);
        }
    }
}
