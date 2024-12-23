package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code92 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()) {
            String s = in.nextLine();
            // 正则表达式 解释如下: 匹配非数字
            //^ 表示从字符串的开头开始匹配 0-9 为数字
            //+ 表示匹配一个或多个
            //[] 表示匹配字符集合
            //split 函数中使用的正则表达式，表示其中间部分为非数字
            String[] x = s.split("[!^0-9]+");
            //String[] x = s.split("[!^0-9]+"); // 表示拆分非数字
            int max = 0;
            for (String ss: x) {
                if (ss.length() > max) {
                    max  = ss.length();
                }
            }
            StringBuffer sb = new StringBuffer();
            for(String ss: x) {
                if (ss.length() == max) {
                    sb.append(ss);
                }
            }
            System.out.println(sb.append(",").append(max));
        }
    }
}
