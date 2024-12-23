package com.github.malinghan.huaweiod;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 描述
 * 明明生成了
 * N
 * N个1到500之间的随机整数。请你删去其中重复的数字，即相同的数字只保留一个，把其余相同的数去掉，然后再把这些数从小到大排序，按照排好的顺序输出。
 *
 * 数据范围：
 * 1≤n≤1000  ，输入的数字大小满足
 * 1≤val≤500
 * 输入描述：
 * 第一行先输入随机整数的个数 N 。 接下来的 N 行每行输入一个整数，代表明明生成的数字。 具体格式可以参考下面的"示例"。请不要自行生成随机数。
 * 输出描述：
 * 输出多行，表示输入数据处理后的结果
 */
//难点：set or map的迭代写法
public class Code03 {
    //去重、逆序排序
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        //while (in.hasNextInt()) {
        // 注意 while 处理多个 case
        int a = in.nextInt();
        //int[] res = new int[a];
        TreeSet<Integer> res = new TreeSet<>();
        for (int i = 0 ; i < a; i++) {
            res.add(in.nextInt());
        }
        int[] arr = new int[res.size()];
        Iterator it = res.iterator();
        int index = 0;
        while(it.hasNext()) {
            arr[index] = (int) it.next();
            index++;
        }
        //Arrays.sort(arr);
        for(int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
        //}
    }
}

//Iterator it = res.iterator();
//        int index = 0;
//        while(it.hasNext()) {
//            arr[index] = (int) it.next();
//            index++;
//        }