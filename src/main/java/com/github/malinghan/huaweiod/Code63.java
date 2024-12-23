package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code63 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String s = in.nextLine();
            int  m = in.nextInt();
            int n = s.length();
            int count = 0;
            int index = -1;
            for(int i = 0; i <= n -m; i++) {
                String sub = s.substring(i, i + m);
                String s1 = sub.replaceAll("C", "");
                s1 = s1.replaceAll("G", "");
                int countX = sub.length() - s1.length();
                //String s2 = sub.replaceAll("[^CG]", "");
                //int countX = s2.length();
                if (countX > count) {
                    count = countX;
                    index = i;
                }
            }
            System.out.println(s.substring(index, index + m));
        }
    }
}
