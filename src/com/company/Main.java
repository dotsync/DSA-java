package com.company;

import com.company.LinkedList.CustomSinglyLinkedListNode;

public class Main {

    public static void main(String[] args) {
        CustomSinglyLinkedListNode head = new CustomSinglyLinkedListNode(1);
        System.out.println(head.getDataNum()); // 1
        System.out.println(head.getNextNode()); // null

        head.setNextNode(new CustomSinglyLinkedListNode(2));
        System.out.println(head.getNextNode().getDataNum()); // 2

        System.out.println(head.getNextNode().getNextNode()); // null
        head.getNextNode().setNextNode(new CustomSinglyLinkedListNode("Accepts Strings too!"));
        System.out.println(head.getNextNode().getNextNode().getDataString()); // "Accepts Strings too!"
    }
}
