package com.company.java.LinkedList;

import org.junit.*;

import static org.junit.Assert.*;

public class SinglyLinkedListTest {

    @Test
    public void addToHead() {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.addToHead("one");
        String expected = ll.head.getData();
        Assert.assertEquals(expected, "one");
    }

    @Test
    public void addToTail() {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.addToTail("hello");
        String expected = ll.head.getData();
        Assert.assertEquals(expected, "hello");
    }

    @Test
    public void removeHead() {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.addToTail("world");
        ll.addToTail("world");
        String expected = ll.head.getData();
        Assert.assertEquals(expected, "world");
    }
}
