package com.github.malinghan.huaweiod;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Code73 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            //
            //1 - 31
            //2 - 28
            //3,5,7,8,10,12 - 31
            //4 - 30
            int year = in.nextInt();
            int month = in.nextInt();
            int day = in.nextInt();
            Map<Integer, Integer> map = new HashMap<>();
            map.put(1, 31);
            map.put(2, 28);
            map.put(3, 31);
            map.put(4, 30);
            map.put(5, 31);
            map.put(6, 30);
            map.put(7, 31);
            map.put(8, 31);
            map.put(9, 30);
            map.put(10, 31);
            map.put(11, 30);
            map.put(12, 31);
            int res = 0;
            for(int i = 1; i < month; i++) {
                int curr = map.get(i);
                if (i == 2 && year % 4 == 0 && year % 100 != 0) {
                    curr = 29;
                }
                res += curr;

            }
            res += day;
            System.out.println(res);
        }
    }
}
