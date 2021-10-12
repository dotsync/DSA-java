package com.company.java.LinkedList;

public class SinglyLinkedList {
    // properties
    public SLLNode head;

    public SinglyLinkedList() {
        head = null;
    }

    public void addToHead(String data) {
        SLLNode newHead = new SLLNode(data);
        if (head != null) {
            newHead.setNext(head);
        }
        head = newHead;
    }

    public void addToTail(String data) {
        SLLNode tail = head;
        if (tail == null) {
            head = new SLLNode(data);
        } else {
            while (tail.getNext() != null) {
                tail = tail.getNext();
            }
            tail.setNext(new SLLNode(data));
        }
    }

    public String removeHead() {
        SLLNode removedHead = head;
        if (removedHead != null) {
            head = removedHead.getNext();
            return removedHead.getData();
        } else {
            return null;
        }
    }

    // print
    public String printList() {
        String output = "<head> ";
        SLLNode currentNode = head;
        while (currentNode != null) {
            output += currentNode.getData() + " ";
            currentNode = currentNode.getNext();
        }
        output += "<tail>";
        System.out.println(output);
        return output;
    }
}
