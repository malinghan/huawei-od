package com.github.malinghan.huaweiod;

import java.util.*;

public class Code94 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            Map<String, Integer> map = new TreeMap<>();
            List<String> list = new ArrayList<>();
            for (int  i = 0; i < n; i++) {
                String s = in.next();
                map.put(s, 0);
                list.add(s);
            }
            int total = in.nextInt();
            int invalid = 0;
            for(int j = 0; j < total; j++) {
                String s = in.next();
                if (map.keySet().contains(s)) {
                    map.put(s, map.get(s)+1);
                } else {
                    invalid++;
                }
            }
            for(String key : list) {
                System.out.println(key + " : " + map.get(key));
            }
            System.out.println("Invalid : " + invalid);
        }
    }
}
