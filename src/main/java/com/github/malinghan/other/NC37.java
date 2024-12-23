package com.github.malinghan.other;

import java.util.ArrayList;

/**
 * https://leetcode.cn/problems/merge-intervals/description/
 */
public class NC37 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param intervals Interval类ArrayList
     * @return Interval类ArrayList
     */
    public ArrayList<Interval> merge (ArrayList<Interval> intervals) {
        // write code here
        // 先按start大小排序
        //再比较合并
       intervals.sort((a, b) -> a.start - b.start);
       for(int  i = 1; i < intervals.size(); i++) {
           Interval curr = intervals.get(i);
           Interval pre = intervals.get(i-1);
           if (curr.start > pre.end) {
              //
           } else {
               pre.end = Math.max(pre.end, curr.end);
               Interval temp  = new Interval();
               temp.start = pre.start;
               temp.end = pre.end;
               intervals.remove(i);
               intervals.set(i-1, temp);
               i--;
           }
       }
       return intervals;
    }
}

//"区间"定义
class Interval {
    int start; //起点
    int end;   //终点
}