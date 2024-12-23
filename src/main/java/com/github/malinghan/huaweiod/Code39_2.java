package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code39_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String mask = in.nextLine();
            String ip1 = in.nextLine();
            String ip2 = in.nextLine();
              if(!isVaildMask(mask) || !isVaildIp(ip1) || !isVaildIp(ip2)){
                 System.out.println(1);
             }else if(isSameSonIp(mask,ip1,ip2)){
                 System.out.println(0);
             }else{
                 System.out.println(2);
             }
        }
    }

    private static boolean isVaildMask(String mask) {
        if(!isVaildIp(mask)) {
            return false;
        }
        String[] mask_arr = mask.split("\\.");
        StringBuilder sb = new StringBuilder();
        for(String ss: mask_arr) {
            String binary = Integer.toBinaryString(Integer.parseInt(ss));
            while(binary.length() < 8) {
                binary = "0" + binary;
            }
            sb.append(binary);
        }
        return sb.toString().lastIndexOf("1") < sb.toString().indexOf("0");
    }

    private static boolean isVaildIp(String ip) {
        String[] ip_arr = ip.split("\\.");
        if (ip_arr.length != 4) {
            return false;
        }
        for(String ss: ip_arr) {
            if (Integer.parseInt(ss) > 255
                    || Integer.parseInt(ss) < 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isSameSonIp(String mask, String ip1,String ip2) {
        //若IP地址或子网掩码格式非法则输出1
        String[] mask_arr = mask.split("\\.");
        String[] ip1_arr = ip1.split("\\.");
        String[] ip2_arr = ip2.split("\\.");
        for(int i=0;i<mask_arr.length;i++){
            if( ( Integer.parseInt(mask_arr[i]) & Integer.parseInt(ip1_arr[i]) ) !=
                    ( Integer.parseInt(mask_arr[i]) & Integer.parseInt(ip2_arr[i]) ) ){
                return false;
            }
        }
        return true;
    }
}
