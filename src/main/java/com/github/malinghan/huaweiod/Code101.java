package com.github.malinghan.huaweiod;

import java.util.*;

public class Code101 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(in.nextInt());
            }
            int order = in.nextInt();
            // list.sort((o1, o2) -> {
            //     if (order == 0) {
            //         //default
            //         return o1 - o2;
            //     } else {
            //         return o2 - o1;
            //     }
            // });
            Collections.sort(list);
            if(order == 1) {
                Collections.reverse(list);
            }
            for(Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
