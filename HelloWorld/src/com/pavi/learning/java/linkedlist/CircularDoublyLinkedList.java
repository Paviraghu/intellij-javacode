package com.pavi.learning.java.linkedlist;

public class CircularDoublyLinkedList {
    private Node head = null;
    private Node tail = null;

    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            head.next = head;
            head.prev = head;
        } else {
            newNode.prev = tail;
            newNode.next = head;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
        }
    }

    public void insertBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            head.next = head;
            head.prev = head;
        } else {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        }
    }

    public void delete(int key) {
        if (head == null) return;

        Node temp = head;

        // If only one node
        if (head == tail && head.data == key) {
            head = tail = null;
            return;
        }

        // If head contains the key
        if (head.data == key) {
            head = head.next;
            head.prev = tail;
            tail.next = head;
            return;
        }

        // Search for the key
        do {
            if (temp.data == key) {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                if (temp == tail) {
                    tail = tail.prev;
                }
                return;
            }
            temp = temp.next;
        } while (temp != head);
    }

    public void printForward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Head)");
    }

    public void printBackward() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = tail;
        do {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.prev;
        } while (temp != tail);
        System.out.println("(Tail)");
    }

    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.insertEnd(10);
        cdll.insertEnd(20);
        cdll.insertEnd(30);
        cdll.insertBeginning(5);

        System.out.println("Circular Doubly Linked List (Forward):");
        cdll.printForward();

        System.out.println("Circular Doubly Linked List (Backward):");
        cdll.printBackward();

        System.out.println("Deleting 20...");
        cdll.delete(20);

        System.out.println("Updated Circular Doubly Linked List (Forward):");
        cdll.printForward();
    }
}