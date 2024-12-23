package com.github.malinghan.huaweiod;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Code08 {
    // 注意类名必须为 Main, 不要有任何 package xxx 信息
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            // 注意 hasNext 和 hasNextLine 的区别
            int n = in.nextInt();
            Map<Integer, Integer> map = new TreeMap<>();
            for(int i = 0 ; i < n; i++) {
                int key = in.nextInt();
                int value = in.nextInt();
                if(!map.containsKey(key)) {
                    map.put(key, value);
                } else {
                    map.put(key, map.get(key) + value);
                }
            }
            map.forEach((k,v) -> {
                System.out.println( k + " " + v);
            });
        }
}
