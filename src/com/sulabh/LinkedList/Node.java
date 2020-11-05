package com.sulabh.LinkedList;

public class Node {

    //declaring data and next node
    private String data;
    private Node nextNode;

    public Node(){}

    public Node(String data){
        this.data = data;
    }

    public Node getNextNode(){
        return nextNode;
    }

    public void setNextNode(Node node){
        this.nextNode = node;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
