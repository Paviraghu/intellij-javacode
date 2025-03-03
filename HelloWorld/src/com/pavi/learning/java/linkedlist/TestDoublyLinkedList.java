package com.pavi.learning.java.linkedlist;

import java.util.Scanner;

class BookNode {

    String bookName;
    BookNode prev, next;

    public BookNode(String bookName) {
        this.bookName = bookName;
        this.prev = null;
        this.next = null;
    }
}

class TestDoublyLinkedList {

    private BookNode head;

    public void insertBook(String bookName) {

        BookNode newNode = new BookNode(bookName);

        if (head == null) {
            head = newNode;
            return;
        }

        BookNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    public void getBookRelation(String bookName, String type) {

        BookNode temp = head;

        while (temp != null) {
            if (temp.bookName.equals(bookName)) {
                if (type.equalsIgnoreCase("p")) {
                    System.out.println("Previous Book: " + (temp.prev != null ? temp.prev.bookName : "No previous book"));
                } else if (type.equalsIgnoreCase("n")) {
                    System.out.println("Next Book: " + (temp.next != null ? temp.next.bookName : "No next book"));
                } else {
                    System.out.println("Invalid input! Type 'p' or 'n'.");
                }
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found.");
    }

    public void deleteBook(String bookName) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookName.equals(bookName)) {
                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                } else {
                    head = temp.next;
                }

                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                }

                System.out.println("Book '" + bookName + "' deleted successfully.");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found.");
    }

    public void displayBooks() {

        BookNode temp = head;

        if (temp == null) {
            System.out.println("No books in the list.");
            return;
        }

        System.out.print("Books: ");
        while (temp != null) {
            System.out.print(temp.bookName + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

class DoublyLinkedListDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TestDoublyLinkedList bookList = new TestDoublyLinkedList();

        bookList.insertBook("Tamil");
        bookList.insertBook("English");
        bookList.insertBook("Maths");
        bookList.insertBook("Science");
        bookList.insertBook("SocialScience");


        bookList.displayBooks();

        System.out.print("Enter book name: ");
        String bookName = scanner.nextLine();

        System.out.print("Type 'p' or 'n' : ");
        String type = scanner.nextLine();

        bookList.getBookRelation(bookName, type);


        System.out.print("Enter book name to delete: ");
        String deleteBook = scanner.nextLine();

        bookList.deleteBook(deleteBook);

        bookList.displayBooks();

        scanner.close();
    }
}
