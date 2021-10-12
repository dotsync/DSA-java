package com.company.java.LinkedList;

public class SinglyLinkedList {
    // properties
    private Node head;

    public SinglyLinkedList() {
        head = null;
    }

    public void addToHead(String data) {
        Node newHead = new Node(data);
        if (head != null) {
            newHead.setNext(head);
        }
        head = newHead;
    }

    public void addToTail(String data) {
        Node tail = head;
        if (tail == null) {
            head = new Node(data);
        } else {
            while (tail.getNext() != null) {
                tail = tail.getNext();
            }
            tail.setNext(new Node(data));
        }
    }

    public String removeHead() {
        Node removedHead = head;
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
        Node currentNode = head;
        while (currentNode != null) {
            output += currentNode.getData() + " ";
            currentNode = currentNode.getNext();
        }
        output += "<tail>";
        System.out.println(output);
        return output;
    }
}
