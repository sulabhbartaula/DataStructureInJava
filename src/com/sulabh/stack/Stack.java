package com.sulabh.stack;

import java.util.Arrays;

//array implementation of stack
//basic operations push, pop
//other operations check if empty or full and give peek value
public class Stack {

    private int arr[];
    private int capacity;
    private int top;

    //constructor to instantiate stack class with size of stack
    public Stack(int size){
        arr = new int[size];
        this.capacity = size;
        top = -1; //empty stack with no value at all
    }

    //method to push an element on top of stack
    //dont push if the stack is full
    public void push(int element){
        if(isStackFull()){
            System.out.println("Stack is Full. Can't add more element");
            System.exit(1);
        }else {
            System.out.println("Inserting Element : "+element);
            arr[++top] = element;
        }
    }

    //method to pop an element from top of the stack
    //exit if the stack is empty
    public int pop(){
        if(isStackEmpty()){
            System.out.println("Stack is Empty. No element to pop");
            System.exit(1);
        }
        return arr[top--];
    }

    //method to return the current size of stack(array)
    public int sizeOfStack(){
        return top + 1;
    }

    //method to check if stack is empty
    private boolean isStackEmpty() {
        return top == -1;
    }

    //method to check if stack is full
    private boolean isStackFull() {
        return top == capacity - 1;
    }

    @Override
    public String toString() {
        return "Stack{" + Arrays.toString(arr) +
                '}';
    }
}
