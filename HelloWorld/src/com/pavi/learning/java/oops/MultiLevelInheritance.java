package com.pavi.learning.java.oops;

class GrandParent {
        void showGrandParent() {
            System.out.println("This is the grandparent class.");
        }
    }

    class Parent extends GrandParent {
        void showParent() {
            System.out.println("This is the parent class.");
        }
    }

    class child extends Parent {
        void showChild() {
            System.out.println("This is the com.pavi.learning.java.OOPS.child class ");
        }
    }

    public class MultiLevelInheritance {

    public static void main(String[] args){
        child child = new child();

        child.showGrandParent();
        child.showParent();
        child.showChild();
    }

    }



