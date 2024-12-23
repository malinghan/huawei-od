package com.github.malinghan.huaweiod;

import java.util.*;
import java.util.Scanner;

import static javax.swing.UIManager.put;

public class Code88 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] cards = input.trim().split("-");
        String output = max(cards[0], cards[1]);
        System.out.println(output);
        //1. 个子、对子、顺子、三个、炸弹、对王
        //2. 炸弹、对王 > 其他
        //3. 个子、对子、三个比牌面、顺子比最小的牌
        //4. 手牌数不相等
    }

    private static String max(String card1, String card2) {
        Map<String,Integer> map = new HashMap<String, Integer>(){
            {
                put("3",3);
                put("4",4);
                put("5",5);
                put("6",6);
                put("7",7);
                put("8",8);
                put("9",9);
                put("10",10);
                put("J",11);
                put("Q",12);
                put("K",13);
                put("A",14);
                put("2",15);
                put("joker",16);
                put("JOKER",17);
            }
        };

        String[] c1 = card1.split(" ");
        String[] c2 = card2.split(" ");

        //super boom
        if (card1.equals("joker JOKER")) {
            return card1;
        } else if (card2.equals("joker JOKER")) {
            return card2;
        }

        //boom
        else if (c1.length == c2.length && c1.length == 4) {
            return map.get(c1[0]) > map.get(c2[0]) ? card1 : card2;
        }

        //one boom
        else if (c1.length == 4) {
            return card1;
        }
        else if (c2.length == 4) {
            return card2;
        }

        //other
        else if (c1.length == c2.length) {
            return map.get(c1[0]) > map.get(c2[0]) ? card1 : card2;
        }
        else {
            return "ERROR";
        }
    }
}
