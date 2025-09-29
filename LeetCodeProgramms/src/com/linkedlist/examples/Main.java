package com.linkedlist.examples;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        // Test 1: Empty list
        System.out.println("Test 1: Empty List");
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.makeEmpty();  // Make list empty
        System.out.println("Expected: null");
        System.out.println("Actual: " +
            (myLinkedList.findMiddleNode() == null
             ? "null"
             : myLinkedList.findMiddleNode().value));
        System.out.println();

        // Test 2: One element
        System.out.println("Test 2: One Element");
        myLinkedList = new LinkedList(1);
        System.out.println("1");
        System.out.println("Expected Middle Node: 1");
        System.out.println("Actual Middle Node: " +
            (myLinkedList.findMiddleNode() == null
             ? "null"
             : myLinkedList.findMiddleNode().value));
        System.out.println();

        // Test 3: Two elements (smallest even list)
        System.out.println("Test 3: Two Elements");
        myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        System.out.println("1 -> 2");
        System.out.println("Expected Middle Node: 2");
        System.out.println("Actual Middle Node: " +
            (myLinkedList.findMiddleNode() == null
             ? "null"
             : myLinkedList.findMiddleNode().value));
        System.out.println();

        // Test 4: Three elements (smallest odd list)
        System.out.println("Test 4: Three Elements");
        myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        System.out.println("1 -> 2 -> 3");
        System.out.println("Expected Middle Node: 2");
        System.out.println("Actual Middle Node: " +
            (myLinkedList.findMiddleNode() == null
             ? "null"
             : myLinkedList.findMiddleNode().value));
        System.out.println();

        // Test 5: Odd number of elements (5 nodes)
        System.out.println("Test 5: Odd Number of Elements");
        myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);
        System.out.println("1 -> 2 -> 3 -> 4 -> 5");
        System.out.println("Expected Middle Node: 3");
        System.out.println("Actual Middle Node: " +
            (myLinkedList.findMiddleNode() == null
             ? "null"
             : myLinkedList.findMiddleNode().value));
        System.out.println();

        // Test 6: Even number of elements (6 nodes)
        System.out.println("Test 6: Even Number of Elements");
        myLinkedList.append(6);
        System.out.println("1 -> 2 -> 3 -> 4 -> 5 -> 6");
        System.out.println("Expected Middle Node: 4");
        System.out.println("Actual Middle Node: " +
            (myLinkedList.findMiddleNode() == null
             ? "null"
             : myLinkedList.findMiddleNode().value));
        System.out.println();

        // Test 7: Larger list (11 nodes)
        System.out.println("Test 7: Larger List (11 Nodes)");
        myLinkedList = new LinkedList(1);
        for (int i = 2; i <= 11; i++) {
            myLinkedList.append(i);
        }
        System.out.println("1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10 -> 11");
        System.out.println("Expected Middle Node: 6");
        System.out.println("Actual Middle Node: " +
            (myLinkedList.findMiddleNode() == null
             ? "null"
             : myLinkedList.findMiddleNode().value));
        System.out.println();

        /*
            EXPECTED OUTPUT:
            ----------------
            Test 1: Empty List
            Expected: null
            Actual: null

            Test 2: One Element
            1
            Expected Middle Node: 1
            Actual Middle Node: 1

            Test 3: Two Elements
            1 -> 2
            Expected Middle Node: 2
            Actual Middle Node: 2

            Test 4: Three Elements
            1 -> 2 -> 3
            Expected Middle Node: 2
            Actual Middle Node: 2

            Test 5: Odd Number of Elements
            1 -> 2 -> 3 -> 4 -> 5
            Expected Middle Node: 3
            Actual Middle Node: 3

            Test 6: Even Number of Elements
            1 -> 2 -> 3 -> 4 -> 5 -> 6
            Expected Middle Node: 4
            Actual Middle Node: 4

            Test 7: Larger List (11 Nodes)
            1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10 -> 11
            Expected Middle Node: 6
            Actual Middle Node: 6
        */
    }

}
