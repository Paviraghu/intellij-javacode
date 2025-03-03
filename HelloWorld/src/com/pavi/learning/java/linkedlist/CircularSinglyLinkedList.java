package com.pavi.learning.java.linkedlist;

public class CircularSinglyLinkedList {

    private Node head = null;
    private Node tail = null;

    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void insertBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            tail.next = head; // Circular link
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head; // Update tail to point to new head
        }
    }

    public void delete(int key) {

        if (head == null) return;

        Node temp = head, prev = null;

        // If head contains the key
        if (head.data == key) {
            if (head == tail) { // Only one node
                head = tail = null;
            } else {
                tail.next = head.next;
                head = head.next;
                System.out.println("Head has key :  tail.next :  " + tail.next.data + " head.next  "+head.next.data);
            }
            return;
        }

        do {
            prev = temp;
            temp = temp.next;
            System.out.println("Key found : " + temp.data);
        } while (temp != head && temp.data != key);

        if (temp.data == key) {
            prev.next = temp.next;
            if (temp == tail) { // If deleting last node
                tail = prev;
            }
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Head)");
    }

    public static void main(String[] args) {

        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.insertEnd(10);
        csll.insertEnd(20);
        csll.insertEnd(30);
        csll.insertBeginning(5);

        System.out.println("Circular Singly Linked List:");
        csll.printList();

        System.out.println("Deleting 20...");
        csll.delete(30);

        System.out.println("Updated Circular Singly Linked List:");
        csll.printList();
    }
}