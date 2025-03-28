package com.bridgelabz.listinterface;

class ListNode {
    char val;
    ListNode next;

    ListNode(char val) {
        this.val = val;
        this.next = null;
    }
}

public class FindNthElement {
    public static void main(String[] args) {
        ListNode head = new ListNode('A');
        head.next = new ListNode('B');
        head.next.next = new ListNode('C');
        head.next.next.next = new ListNode('D');
        head.next.next.next.next = new ListNode('E');

        int n = 2;

        ListNode element = findNthElement(head, n);

        if (element != null) {
            System.out.println("The nth element from the end is : " + element.val);
        }
        else {
            System.out.println("N is out of bounds or List is empty");
        }
    }

    // Method to find the nth element from the end of linked list
    public static ListNode findNthElement(ListNode head, int n) {
        ListNode p1 = head;
        ListNode p2 = head;

        for (int i = 0; i < n; i++) {
            if (p2 == null) {
                return null;
            }
            p2 = p2.next;
        }

        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}

/*
Input:
    Linked List: [A, B, C, D, E]
    N = 2;
Output:
    The nth element from the end is : D
 */