package com.pavi.learning.java.linkedlist;

public class DoublyLinkedList {

    private Node head;
    private Node tail;

    public void insertEnd(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void insertBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Delete a node by value
    public void delete(int key) {
        Node temp = head;

        // If head node is to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next;
            if (head != null) head.prev = null;
            return;
        }

        // Search for the node to delete
        while (temp != null && temp.data != key) {
            temp = temp.next;
            System.out.println("Key found : " + temp.data);
        }

        // If node not found
        if (temp == null) return;

        // If the node is the last one
        if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
            return;
        }

        // Remove node from the middle
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    public void printForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void printBackward() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    // Main method for testing
    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertEnd(10);
        dll.insertEnd(20);
        dll.insertEnd(30);
        dll.insertBeginning(5);

        System.out.println("Doubly Linked List (Forward):");
        dll.printForward();

        System.out.println("Doubly Linked List (Backward):");
        dll.printBackward();

        System.out.println("Deleting 20...");
        dll.delete(20);

        System.out.println("Updated DLL (Forward):");
        dll.printForward();
    }
}
