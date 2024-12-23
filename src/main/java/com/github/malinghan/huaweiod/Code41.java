package com.github.malinghan.huaweiod;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Code41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            int[] mArr = new int[n];
            int[] xArr = new int[n];
            for(int i = 0; i < n;i ++) {
                mArr[i] = in.nextInt();
            }
            for(int i = 0; i < n;i ++) {
                xArr[i] = in.nextInt();
            }
            Set<Integer> set =  new HashSet<>();
            //初始化个数，不初始化无法启动计算
            set.add(0);
            for(int i =0; i < n; i++) {
                //当前结果
                ArrayList<Integer> list = new ArrayList<>(set);
                int m = mArr[i];
                int x = xArr[i];
                for(int j = 0; j <= x; j++) {
                    for(int k = 0; k < list.size(); k++) {
                        set.add(list.get(k) + m * j);
                    }
                }
            }
            System.out.print(set.size());
        }
    }
}
