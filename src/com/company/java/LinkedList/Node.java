package com.company.java.LinkedList;

import lombok.Data;

public @Data class Node {
    private String data;
    private Node next;

    // constructor
    public Node(String data) {
        this.data = data;
        this.next = null;
   }
}
