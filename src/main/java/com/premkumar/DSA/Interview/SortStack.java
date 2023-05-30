package com.premkumar.DSA.Interview;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(2);
        stack.push(8);
        stack.push(1);
        stack.push(3);

        System.out.println("Stack before sorting: " + stack);
        sortStack(stack);
        System.out.println("Stack after sorting: " + stack);
    }

    public static void sortStack(Stack<Integer> stack) {
   if(stack.isEmpty() || stack.size()==1) return;
   Integer op=stack.pop();
   sortStack(stack);
   insertAtCorrectPosition(stack,op);
    }
   static public void insertAtCorrectPosition(Stack<Integer> stack,Integer es) {

       if (stack.isEmpty() || stack.peek() <= es) {
           stack.push(es);
       } else {
           Integer s = stack.pop();
           insertAtCorrectPosition(stack, es);
           stack.push(s);
       }
   }
}
