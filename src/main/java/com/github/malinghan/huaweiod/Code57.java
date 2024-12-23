package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code57 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String a = in.nextLine();
        String b = in.nextLine();
        int n = a.length();
        int m = b.length();
        int flag = 0;
        int i =  1;
        String res = "";
        while(i <= n || i <= m) {
            int na  = i <= n ? a.charAt(n-i) - '0':0;
            int nb  = i <= m ? b.charAt(m-i) - '0' : 0;
            int sum = na + nb + flag;
            if (sum > 9) {
                flag = 1;
                sum = sum - 10;
            } else {
                flag = 0;
            }
            res = String.valueOf(sum) + res;
            i++;
        }
        if (flag == 1) {
            res = "1" + res;
        }
        System.out.println(res);
    }
}
