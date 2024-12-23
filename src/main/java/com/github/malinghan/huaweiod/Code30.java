package com.github.malinghan.huaweiod;

import java.util.Arrays;
import java.util.Scanner;

public class Code30 {
        public static void main(String[] str) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                String s1 = sc.next();
                String s2 = sc.next();
                char[] chars = (s1 + s2).toCharArray();
                String[] res = new String[chars.length];
                //偶数位
                char[] r1 = new char[chars.length / 2];
                //奇数位
                char[] r2 = new char[chars.length - chars.length / 2];
                for (int i = 0, j = 0, k = 0; i < chars.length; i++) {
                    if (i % 2 == 0) {
                        r2[j] = chars[i];
                        j++;
                    } else {
                        r1[k] = chars[i];
                        k++;
                    }
                }
                Arrays.sort(r1);
                Arrays.sort(r2);
                for (int i = 0, j = 0, k = 0; i < chars.length; i++) {
                    if (i % 2 == 0) {
                        res[i] = getFanyiStr(r2[j]);
                        j++;
                    } else {
                        res[i] = getFanyiStr(r1[k]);
                        k++;
                    }
                }
                StringBuilder sb = new StringBuilder();
                for (String re : res) {
                    sb.append(re);
                }
                System.out.println(sb.toString());
            }
        }

        private static String getFanyiStr(char c) {
            String res;
            if ((c >= '0' && c <= '9')
                    || (c >= 'a' && c <= 'f')
                    || (c >= 'A' && c <= 'F')) {
                String s = Integer.toBinaryString(Integer.parseInt(Character.toString(c), 16));
                StringBuilder sb = new StringBuilder(s).reverse();
                while (sb.length() < 4) {
                    sb.append("0");
                }
                res = Integer.toHexString(Integer.parseInt(sb.toString(), 2)).toUpperCase();
            } else {
                res = Character.toString(c);
            }
            return res;
        }
}
