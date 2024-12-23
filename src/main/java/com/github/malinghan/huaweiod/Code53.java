package com.github.malinghan.huaweiod;

import java.util.Scanner;

/**
 * 奇偶规律
 */
public class Code53 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            if (n < 3) {
                System.out.println("-1");
            } else if( n %4 == 0) {
                System.out.println(3);
            } else if ( n %4 != 0 &&  n %2 == 0){
                //第一个偶数的index
                System.out.println(4);
            } else {
                System.out.println(2);
            }
        }
    }
}
