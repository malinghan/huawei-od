package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code22 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            // 注意 hasNext 和 hasNextLine 的区别
            while (in.hasNextInt()) { // 注意 while 处理多个 case
                int n = in.nextInt();
                int count = 0;
                //输入的 0 表示输入结束，并不用输出结果
                if ( n == 0) {
                    break;
                }
                while(n > 1) {
                    //归还3个空瓶子
                    n -= 3;
                    //喝掉
                    count++;
                    //多一个空瓶子
                    n++;
                }
                System.out.println(count);
            }
        }
}
