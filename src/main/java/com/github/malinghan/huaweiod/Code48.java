package com.github.malinghan.huaweiod;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Code48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int count = in.nextInt();
            int head = in.nextInt();
            List<int[]> list = new ArrayList<>();
            for (int i = 0; i < count - 1; i++) {
                list.add(new int[] {in.nextInt(), in.nextInt()});
            }
            int delete = in.nextInt();
            ListNode dummy = new ListNode(-1);
            dummy.next = new ListNode(head);
            addNode(list, dummy);
            deleteNode(dummy, delete);
            ListNode currentListNoe = dummy.next;
            while (currentListNoe != null) {
                System.out.print(currentListNoe.val + " ");
                currentListNoe = currentListNoe.next;
            }

        }
    }
    public static void addNode(List<int[]> list, ListNode dummy) {
        for (int i = 0; i < list.size(); i++) {
            int[] temp = list.get(i);
            ListNode tt = dummy.next;
            while (tt != null) {
                if (tt.val == temp[1]) {
                    ListNode ListNext = tt.next;
                    tt.next = new ListNode(temp[0]);
                    tt.next.next = ListNext;
                    break;
                }
                tt = tt.next;
            }
        }
    }
    public static void deleteNode (ListNode dummy, int deleteNode) {
        ListNode current = dummy.next;
        ListNode PreNode = dummy;
        while (current != null) {
            if (current.val == deleteNode) {
                PreNode.next = current.next;
                current.next = null;
            }
            current = current.next;
            PreNode = PreNode.next;
        }
    }
}
