package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code105 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            // 注意 hasNext 和 hasNextLine 的区别
            int temp = 0;
            int countN = 0;
            int countP = 0;
            double sum = 0.0;
            while (in.hasNextInt()) { // 注意 while 处理多个 case
                temp = in.nextInt();
                if(temp<0){
                    countN++;
                }else if(temp>0){
                    countP++;
                    sum += temp;
                }
            }
            System.out.println(countN);
            if(countP==0){
                System.out.printf("0.0");
            }else{
                System.out.printf("%.1f\n",sum/countP);
            }
        }

}
