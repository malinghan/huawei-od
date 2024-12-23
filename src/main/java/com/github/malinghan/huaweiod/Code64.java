package com.github.malinghan.huaweiod;

import java.util.Scanner;

/**
 * 滑动窗口移动光标
 * 1. 计算index位置
 * 2. 计算滑动窗口位置
 */
public class Code64 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) {
            int n = in.nextInt();
            String s = in.next();
            //窗口起始位置
            int start = 1;
            //窗口终止位置
            int end = Math.min(n,4);
            //光标位置
            int index = 1;
            //移动
            for(int i = 0; i < s.length(); i++) {
                //向上指令
                if (s.charAt(i) == 'U') {
                    //计算光标:
                    //index = (index - 1 + n -1) % n + 1;
                    if(index == 1) {
                        index = n;
                    } else {
                        index = index-1;
                    }
                } else if (s.charAt(i) == 'D') {
                    if(index == n) {
                        index = 1;
                    } else {
                        index = index+1;
                    }
                    //index = index % n + 1;
                }
                //光标在窗口上
                if (index < start) {
                    start = index;
                    end = start + 3;
                } else if (index > end) {
                    end = index;
                    start = end -3;
                }
            }

            for(int i = start; i <= end; i++) {
                System.out.print(i + " ");
            }
            System.out.println("");
            System.out.println(index);
        }
    }
}
