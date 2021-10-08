package com.company.LinkedList;

public class CustomSinglyLinkedList {
    // properties
    private CustomSinglyLinkedListNode head = null;

    // constructors
    // this confused me, I dont think I need a constructor.

    // addToHead
    public void addToHead(int data) {
        // create new head
        CustomSinglyLinkedListNode newHead = new CustomSinglyLinkedListNode(data);
        // if there is already a head, set pointer
        if (head != null) {
            newHead.setNextNode(head);
        }
        // replace head
        head = newHead;
    }

    // print
    public void print() {
        CustomSinglyLinkedListNode currentNode = head;
        String printedList = "Head-> ";
        while (currentNode != null) {
            printedList += currentNode.getDataNum();
            currentNode = currentNode.getNextNode();
        }
        System.out.println(printedList);
    }
}
