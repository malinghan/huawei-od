package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code81 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String a = in.nextLine();
            String b = in.nextLine();
            boolean res = true;
            for(char c: a.toCharArray()) {
                if(!b.contains(c + "")) {
                    res = false;
                    break;
                }
            }
            System.out.println(res);
        }
    }
}
