package com.github.malinghan.huaweiod;

//定义链表结构
public class ListNode {
    int val;
    com.github.malinghan.huaweiod.ListNode next;
    public ListNode(){}
    public ListNode(int val){
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next  = next;
    }
}