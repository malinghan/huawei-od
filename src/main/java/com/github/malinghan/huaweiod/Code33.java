package com.github.malinghan.huaweiod;

import java.util.Scanner;

/**
 * 核心要点
 * 1. 使用Long来定义32位数字
 * 2. 熟悉各种进制转换函数
 * 3. 注意补0
 */
public class Code33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while(in.hasNext()) {
            String s= in.nextLine();
            if (s.contains(".")){
                String[] sp = s.split("\\.");
                StringBuilder sb = new StringBuilder();
                for (int i = 0 ; i < sp.length; i++) {
                    String binary = Integer.toBinaryString(Integer.valueOf(sp[i]));
                    while(binary.length() < 8) {
                        binary = "0" + binary;
                    }
                    sb.append(binary);
                }
                System.out.println(Long.parseLong(sb.toString(),2));
            } else {
                numtoIp1(s);
            }
        }
    }

    private static void numtoIp1(String s) {
        long ip = Long.parseLong(s);
        String result = "";
        for(int i = 0 ; i < 4; i++) {
            result = ip % 256 + "." + result;
            ip /= 256;
        }
        System.out.println(result.substring(0, result.length() -1));
    }

    private static void NumtoIp(String s) {
        String ip = Long.toBinaryString(Long.parseLong(s));
        while(ip.length() < 32) {
            ip = "0" + ip;
        }
        String[] ans = new String[4];
        int index =0 ;
        for(int i = 8; i <= ip.length(); i +=8) {
            String pip = ip.substring(i-8, i);
            int pNum = Integer.parseInt(pip, 2);
            ans[index++]  = Integer.toString(pNum);
        }
        System.out.println(String.join(".", ans));
    }
}
