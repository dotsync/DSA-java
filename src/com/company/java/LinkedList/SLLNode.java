package com.company.java.LinkedList;

import lombok.Data;

public @Data class SLLNode {
    private String data;
    private SLLNode next;

    // constructor
    public SLLNode(String data) {
        this.data = data;
        this.next = null;
   }
}
