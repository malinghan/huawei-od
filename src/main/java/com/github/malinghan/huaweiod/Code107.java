package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code107 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            double a = in.nextDouble();
            double x = getRes(a);
            System.out.printf("%.1f",x);
        }
    }

    private static double getRes(double num) {
        double l ,r , mid = 0.0;
        r = Math.max(1.0, num);
        l = Math.min(-1.0, num);
        //精度很重要
        while(r - l > 0.001) {
            mid = (l + r) /2;
            if (mid * mid * mid > num) {
                r = mid;
            } else if (mid * mid * mid < num) {
                l = mid;
            } else {
                return mid;
            }
        }
        return r;
    }

    //时间复杂度 O(log(n))
    //空间复杂度 O(1)
}
