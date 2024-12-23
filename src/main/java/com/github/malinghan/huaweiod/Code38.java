package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区
        int h = in.nextInt();
        double path = 0;
        double len = h;
        int count = 0;
        for(int i = 1; i <= 5; i++) {
            path +=  len + len/2;
            len = len /2;
        }
        //第5次落地时的距离。而不是反弹后的高度
        path -= len;
        System.out.println(path);
        System.out.println(len);
    }
}
