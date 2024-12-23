package com.github.malinghan.huaweiod;

import java.util.Scanner;

/**
 * 递归法
 */
public class Code61 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int m = in.nextInt();
            int n = in.nextInt();
            System.out.println(count(m, n));
        }
    }
    /**
     * m个水果放到n个盘子 =
     * m个水果放到n-1个盘子 + m-n个水果放到n个盘子
     */
    private static int count(int i, int j) {
        //允许有的盘子空着不放
        if (i < 0 || j < 0 || j == 0) {
            return 0;
        } else if (i == 1 || j == 1 || i == 0) {
            return 1;
        } else {
            //1. 至少有一个盘子是空的
            //2. 盘子都不会空 => i -j个苹果放到j个盘子
            return count(i, j-1) + count(i-j, j);
        }
    }
}
