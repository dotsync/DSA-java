package com.company.LinkedList;

public class CustomSinglyLinkedListNode {
    private int dataNum;
    private String dataString;
    private CustomSinglyLinkedListNode next = null;

    // constructor
    public CustomSinglyLinkedListNode(int data) {
        dataNum = data;
    }
    public CustomSinglyLinkedListNode(String data) {
        dataString = data;
    }

    // getData
    public int getDataNum() {
        return dataNum;
    }
    public String getDataString() {
        return dataString;
    }

    // getNextNode
    public CustomSinglyLinkedListNode getNextNode() {
        return next;
    }
    // setNextNode
    public void setNextNode(CustomSinglyLinkedListNode newNode) {
        next = newNode;
    }
}
