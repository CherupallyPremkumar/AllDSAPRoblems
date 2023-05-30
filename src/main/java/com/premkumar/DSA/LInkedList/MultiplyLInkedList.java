package com.premkumar.DSA.LInkedList;
class ListNode{
    int val;
    ListNode next;
}
public class MultiplyLInkedList {
    class Solution {
        public ListNode mergeNodes(ListNode head) {
            boolean firstZero = false;
            ListNode v = head;
            ListNode point = null;
            int sum = 0;
            while (v != null) {
                if (v.val == 0) {
                    if (firstZero) {
                        point.val = sum;
                        point.next = v;
                        sum = 0;
                    }
                    point = v;
                    firstZero = true;
                } else sum += v.val;

                v = v.next;
            }
            return head;
        }
    }
}
