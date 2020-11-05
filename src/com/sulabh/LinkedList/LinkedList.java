package com.sulabh.LinkedList;
/*
linked list implementation in java.
In this program, different operations like adding head, tail , removing nodes and traversing different nodes
of the linkedlist is being performed.
 */
public class LinkedList {

    public Node head;

    public LinkedList(){
        this.head = null;
    }

    //adding new head to the linkedlist
    public void addToHead(String data) {
        Node newHead = new Node(data);
        Node currentHead = this.head;
        this.head = newHead;
        if (currentHead != null) {
            this.head.setNextNode(currentHead);
        }
    }

    //adding new node to the tail
    public void addToTail(String data) {
        Node tail = this.head;
        if (tail == null) {
            this.head = new Node(data);
        } else {
            while (tail.getNextNode() != null) {
                tail = tail.getNextNode();
            }
            tail.setNextNode(new Node(data));
        }
    }

    //remove the existing head
    public String removeHead() {
        Node removedHead = this.head;
        if (removedHead == null) {
            return null;
        }
        this.head = removedHead.getNextNode();
        return removedHead.getData();
    }

    public String printList() {
        String output = "<head> ";
        Node currentNode = this.head;
        while (currentNode != null) {
            output += currentNode.getData() + " ";
            currentNode = currentNode.getNextNode();
        }
        output += "<tail>";
        System.out.println(output);
        return output;
    }

    //implementation of linkedlist
    public static void main(String []args) {

        LinkedList seasons = new LinkedList();
        seasons.addToHead("summer");
        seasons.addToHead("spring");
        seasons.addToTail("fall");
        seasons.addToTail("winter");
        seasons.removeHead();
        seasons.printList();

    }
}
