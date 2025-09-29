package com.linkedlist.examples;

public class LinkedListHasLoop {

	  private Node head;
	    private Node tail;

	    class Node {
	        int value;
	        Node next;

	        Node(int value) {
	            this.value = value;
	        }
	    }

	    public LinkedListHasLoop(int value) {
	        Node newNode = new Node(value);
	        head = newNode;
	        tail = newNode;
	    }

	    public Node getHead() {
	        return head;
	    }

	    public Node getTail() {
	        return tail;
	    }

	    public void printList() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.println(temp.value);
	            temp = temp.next;
	        }
	    }

	    public void printAll() {
	        if (head == null) {
	            System.out.println("Head: null");
	            System.out.println("Tail: null");
	        } else {
	            System.out.println("Head: " + head.value);
	            System.out.println("Tail: " + tail.value);
	        }
	        System.out.println("\nLinked List:");
	        if (head == null) {
	            System.out.println("empty");
	        } else {
	            printList();
	        }
	    }
	    
	    public void makeEmpty() {
	        head = null;
	        tail = null;
	    }

	    public void append(int value) {
	        Node newNode = new Node(value);
	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	        } else {
	            tail.next = newNode;
	            tail = newNode;
	        }
	    }

		// WRITE FIND MIDDLE NODE METHOD HERE //
		//                                    //
		//                                    //
		//                                    //
		//                                    //
		////////////////////////////////////////
	    public Node findMiddleNode(){
	        if(head==null){
	            return null;
	        }
	        Node slow=head;
	        Node fast=head;
	        while(fast!=null && fast.next!=null){
	            slow=slow.next;
	            fast=fast.next.next;
	        }
	        return slow;
	        
	        
	    }
	    public Boolean hasLoop() {
	    	Node slow=head;
	    	Node fast=head;
	    	while(fast!=null && fast.next!=null) {
	    		slow=slow.next;
	    		fast=fast.next.next;
	    		if(slow==fast) return true;
	    	}
	    	return false;
	    }
	    
	    public static void main(String[] args) {

	        // Test 1: Empty list
	        System.out.println("Test 1: Empty List");
	        LinkedListHasLoop myLinkedList = new LinkedListHasLoop(1);
	        myLinkedList.makeEmpty();  // Make list empty
	        System.out.println("Expected: false");
	        System.out.println("Actual: " + myLinkedList.hasLoop());
	        System.out.println();

	        // Test 2: One node, no loop
	        System.out.println("Test 2: One Node (No Loop)");
	        myLinkedList = new LinkedListHasLoop(1);
	        System.out.println("Expected: false");
	        System.out.println("Actual: " + myLinkedList.hasLoop());
	        System.out.println();

	        // Test 3: One node, with loop to itself
	        System.out.println("Test 3: One Node (Loop to Itself)");
	        myLinkedList = new LinkedListHasLoop(1);
	        myLinkedList.getHead().next = myLinkedList.getHead();  // Create loop
	        System.out.println("Expected: true");
	        System.out.println("Actual: " + myLinkedList.hasLoop());
	        System.out.println();

	        // Test 4: Multi-node, no loop
	        System.out.println("Test 4: Multi-Node (No Loop)");
	        myLinkedList = new LinkedListHasLoop(1);
	        myLinkedList.append(2);
	        myLinkedList.append(3);
	        myLinkedList.append(4);
	        System.out.println("1 -> 2 -> 3 -> 4");
	        System.out.println("Expected: false");
	        System.out.println("Actual: " + myLinkedList.hasLoop());
	        System.out.println();

	        // Test 5: Multi-node, loop back to head
	        System.out.println("Test 5: Multi-Node (Loop to Head)");
	        myLinkedList = new LinkedListHasLoop(1);
	        myLinkedList.append(2);
	        myLinkedList.append(3);
	        myLinkedList.append(4);
	        myLinkedList.getTail().next = myLinkedList.getHead();  // Loop to head
	        System.out.println("1 -> 2 -> 3 -> 4 -> (loops back to 1)");
	        System.out.println("Expected: true");
	        System.out.println("Actual: " + myLinkedList.hasLoop());
	        System.out.println();

	        // Test 6: Multi-node, loop in the middle
	        System.out.println("Test 6: Multi-Node (Loop to Middle Node)");
	        myLinkedList = new LinkedListHasLoop(1);
	        myLinkedList.append(2);
	        myLinkedList.append(3);
	        myLinkedList.append(4);
	        LinkedListHasLoop.Node middle = myLinkedList.getHead().next.next;  // Node 3
	        myLinkedList.getTail().next = middle;  // Tail loops to 3
	        System.out.println("1 -> 2 -> 3 -> 4 -> (loops back to 3)");
	        System.out.println("Expected: true");
	        System.out.println("Actual: " + myLinkedList.hasLoop());
	        System.out.println();

	        /*
	            EXPECTED OUTPUT:
	            ----------------
	            Test 1: Empty List
	            Expected: false
	            Actual: false

	            Test 2: One Node (No Loop)
	            Expected: false
	            Actual: false

	            Test 3: One Node (Loop to Itself)
	            Expected: true
	            Actual: true

	            Test 4: Multi-Node (No Loop)
	            1 -> 2 -> 3 -> 4
	            Expected: false
	            Actual: false

	            Test 5: Multi-Node (Loop to Head)
	            1 -> 2 -> 3 -> 4 -> (loops back to 1)
	            Expected: true
	            Actual: true

	            Test 6: Multi-Node (Loop to Middle Node)
	            1 -> 2 -> 3 -> 4 -> (loops back to 3)
	            Expected: true
	            Actual: true
	        */
	        
	    }
	    
}
