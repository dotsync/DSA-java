package com.company;

import com.company.LinkedList.CustomSinglyLinkedList;
import com.company.LinkedList.CustomSinglyLinkedListNode;

public class Main {

    public static void main(String[] args) {
        CustomSinglyLinkedList ll = new CustomSinglyLinkedList();
        ll.addToHead(3);
        ll.print(); // 3
        ll.addToHead(2);
        ll.addToHead(1);
        ll.print(); // head -> 1 2 3
    }
}
