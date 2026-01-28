package org.example.neetcode.linkedlist;

import org.example.models.ListNode;

public class ReverseLinkedList {

    public static ListNode example(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}