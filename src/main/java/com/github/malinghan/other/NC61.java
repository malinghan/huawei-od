package com.github.malinghan.other;

import java.util.HashMap;

/**
 * 两数之和
 */
public class NC61 {
    /**
     *
     * @param numbers int整型一维数组
     * @param target int整型
     * @return int整型一维数组
     */
    public int[] twoSum (int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2] ;
        for(int i=0;i<numbers.length;i++){
            if(map.containsKey(numbers[i])){
                res = new int[]{map.get(numbers[i])+1,i+1};
            }
            else{
                map.put(target-numbers[i],i);
            }
        }
        return res;
    }
}
