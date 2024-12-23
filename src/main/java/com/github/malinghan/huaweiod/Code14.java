package com.github.malinghan.huaweiod;

import java.util.Arrays;
import java.util.Scanner;

public class Code14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        //while (in.hasNextInt()) { // 注意 while 处理多个 case
        int n = in.nextInt();
        in.nextLine(); //读取换行符
        String[] arrs = new String[n];
        for(int i = 0 ;  i < n; i++) {
            arrs[i] = in.nextLine();
        }
        Arrays.sort(arrs);
        for(String s: arrs) {
            System.out.println(s);
        }
    }
}
