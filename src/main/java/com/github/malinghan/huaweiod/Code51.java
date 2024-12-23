package com.github.malinghan.huaweiod;

import java.util.Scanner;

public class Code51 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int n = in.nextInt();
            ListNode dummy = new ListNode(-1, null);
            ListNode head = dummy;
            for(int i = 0 ; i < n; i++) {
                ListNode node = new ListNode(in.nextInt(),null);
                head.next = node;
                head = node;
            }
            int k = in.nextInt();
            for(int i = 0; i <= n-k; i++) {
                dummy = dummy.next;
            }
            System.out.println(dummy.val);
        }
    }
}
