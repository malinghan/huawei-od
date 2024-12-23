package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code18 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            // 注意 hasNext 和 hasNextLine 的区别
            int a = 0, b =0 ,c = 0, d = 0, e = 0 , m = 0, p = 0;
            while (in.hasNextLine()) { // 注意 while 处理多个 case
                String s = in.nextLine();
                String ip = s.split("\\~")[0];
                String mask = s.split("\\~")[1];
                String[] ips =  s.split("\\.");
                int first = Integer.valueOf(ips[0]);
                if (first == 0 || first == 127) {
                    continue;
                }
                 if (maskIsInvaild(mask)) {
                     m++;
                     continue;
                 }
                if (ipIsInvaild(ip)) {
                    m++;
                    continue;
                }

                if (first >= 1 && first <= 126) {
                    a++;
                }
                else if (first >= 128 && first <= 191) {
                    b++;
                }
                else if (first >= 192 && first <= 223) {
                    c++;
                }
                else if (first >= 224 && first <= 239) {
                    d++;
                }
                else if (first >= 240 && first <= 255) {
                    e++;
                }
                int second = Integer.valueOf(ips[1]);
                if (first == 10 ||
                        (first == 172 && second >= 16 && second <=31)
                        || (first == 192 && second == 168)) {
                    p++;
                }
            }
            System.out.println(
                    a+" "+ b +" "+
                            c+" "+
                            d+" "+
                            e+" "+
                            m+" "+
                            p);
        }

        public static boolean ipIsInvaild(String ip) {
            String[] ipArr = ip.split("\\.");
            if (ipArr.length != 4) {
                return true;
            }
            if (Integer.valueOf(ipArr[0]) > 255
                    || Integer.valueOf(ipArr[1]) > 255
                    || Integer.valueOf(ipArr[2]) > 255
                    || Integer.valueOf(ipArr[3]) > 255) {
                return true;
            }
            return false;
        }
        //子网掩码判断法
        static boolean maskIsInvaild(String s) {
            String[] maskArr = s.split("\\.");
            if (maskArr.length != 4) {
                return true;
            }
            String maskBinary = toBinary(maskArr[0]) +
                    toBinary(maskArr[1]) +
                    toBinary(maskArr[2]) +
                    toBinary(maskArr[3]);
            if (!maskBinary.matches("[1]{1,}[0]{1,}")) {
                return true;
            }
            return false;
        }

        static String toBinary(String num) {
            String numBinary = Integer.toBinaryString(Integer.valueOf(num));
            while(numBinary.length() < 8) {
                numBinary = '0' + numBinary;
            }
            return numBinary;
        }
}
