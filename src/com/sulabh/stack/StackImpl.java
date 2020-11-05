package com.sulabh.stack;

public class StackImpl {

    public static void main(String[] args) {

        Stack stack = new Stack(5);

        System.out.println("Current size of stack : "+stack.sizeOfStack());

        stack.push(56);
        stack.push(85);
        stack.push(85);
        stack.push(22);
        stack.push(63);

        System.out.println("\nPrint Element of Stack ");
        System.out.println(stack.toString());

        System.out.println("\nPrint Element of Stack After Poping ");
        System.out.println(stack.pop());

    }
}
