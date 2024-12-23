package com.github.malinghan.huaweiod;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Code68 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        HashMap<Integer,String> map = new HashMap<>();
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            int n = Integer.parseInt(in.nextLine());
            int order = Integer.parseInt(in.nextLine());
            int[][] score = new int[n][2];
            for(int i = 0 ; i < n; i++) {
                String[] nameAndScore = in.nextLine().split(" ");
                score[i][0] = i;
                score[i][1] = Integer.parseInt(nameAndScore[1]);
                map.put(i, nameAndScore[0]);
            }
            Arrays.sort(score, (o1, o2) -> {
                if (order == 0) {
                    return o2[1] - o1[1];
                } else {
                    return o1[1] - o2[1];
                }
            });
            for (int i = 0; i < n; i++) {
                System.out.println(map.get(score[i][0]) +
                        " " + score[i][1]);
            }
        }
    }
}
