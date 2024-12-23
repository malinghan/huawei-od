package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code39 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String mask = in.nextLine();
            String ip1 = in.nextLine();
            String ip2 = in.nextLine();
            //若IP地址或子网掩码格式非法则输出1
            String[] mask_arr = mask.split("\\.");
            String[] ip1_arr = ip1.split("\\.");
            String[] ip2_arr = ip2.split("\\.");

            int[] mask_int_arr = new int[4];
            int[] ip1_int_arr = new int[4];
            int[] ip2_int_arr = new int[4];
            int flag = -1;
            for(int i = 0; i < 4; i++) {
                mask_int_arr[i] = Integer.valueOf(mask_arr[i]);
                ip1_int_arr[i] = Integer.valueOf(ip1_arr[i]);
                ip2_int_arr[i] = Integer.valueOf(ip2_arr[i]);
                if (mask_int_arr[i] > 255 || mask_int_arr[i] < 0 ||
                        ip1_int_arr[i] > 255 || ip1_int_arr[i] < 0 ||
                        ip2_int_arr[i] > 255 || ip2_int_arr[i] < 0 ) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("1");
                continue;
            }
            if (mask_int_arr[0] != 255 || mask_int_arr[3] != 0) {
                System.out.println("1");
                continue;
            }
            //若IP1与IP2属于同一子网络输出0
            //若IP1与IP2不属于同一子网络输出2
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for(int i = 0; i < 4; i++) {
                sb1.append(mask_int_arr[i] & ip1_int_arr[i]);
                sb2.append(mask_int_arr[i] & ip2_int_arr[i]);
            }
            if (sb1.toString().equals(sb2.toString())) {
                System.out.println("0");
            } else {
                System.out.println("2");
            }
        }
    }
}
