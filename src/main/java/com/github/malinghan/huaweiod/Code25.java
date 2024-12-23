package com.github.malinghan.huaweiod;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Code25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n1 = in.nextInt();
        int[] I = new int[n1];
        for(int  i = 0 ; i < n1; i++) {
            I[i] = in.nextInt();
        }
        int n2 = in.nextInt();
        int[] R = new int[n2];
        for(int i = 0 ; i < n2; i++) {
            R[i] = in.nextInt();
        }
        Arrays.sort(R);
        Set<Integer> set = new HashSet<>();
        int count = 0;
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < n2;i++) {
            if (set.contains(R[i])) {
                continue;
            }
            set.add(R[i]);
            int countI = 0;
            StringBuilder sb2 = new StringBuilder("");
            for(int j = 0; j < n1; j++) {
                if(String.valueOf(I[j])
                        .contains(String.valueOf(R[i]))) {
                    countI++;
                    sb2.append(j + " " + I[j] + " ");
                    count += 2;
                }
            }
            if(countI > 0) {
                sb.append(R[i]+" " + countI + " ").append(sb2);
                count += 2;
            }
        }
        StringBuilder res = new StringBuilder("");
        res.append(count + " ");
        res.append(sb);
        System.out.println(res);
    }
}
