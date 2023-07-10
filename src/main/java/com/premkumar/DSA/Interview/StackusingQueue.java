package com.premkumar.DSA.Interview;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

//stack 1->
//stack 2->1
public class StackusingQueue {

   static Stack<Integer> a=new Stack<Integer>();
   static Stack<Integer> b=new Stack<Integer>();

   public  StackusingQueue()
   {

   }
   public  void enQueue(Integer e)
   {
       a.push(e);
       while(!a.isEmpty()) {
           b.push(a.peek());
           a.pop();
       }
   }
    public  Integer deQueue() {
        int a1=0;
        while(!b.isEmpty())
        {
            a.push(b.peek());
            a1=b.pop();
        }
        a.pop();
        while(!a.isEmpty()) {
            b.push(a.peek());
            a.pop();
        }
        return a1;
    }
        public void print()
   {
       System.out.println(a);
       System.out.println(b);
   }

    public static void main(String[] args) {
       StackusingQueue stackusingQueue=new StackusingQueue();
       stackusingQueue.enQueue(1);
       stackusingQueue.enQueue(2);
       stackusingQueue.enQueue(3);
        System.out.println(stackusingQueue.deQueue());
       stackusingQueue.enQueue(4);
       stackusingQueue.enQueue(5);
       stackusingQueue.print();
        stackusingQueue.enQueue(11);
        stackusingQueue.enQueue(22);
        stackusingQueue.enQueue(33);
        System.out.println(stackusingQueue.deQueue());
        stackusingQueue.enQueue(44);
        stackusingQueue.enQueue(55);
       stackusingQueue.print();


    }
}
//SELECT * FROM EMPLOYEE
//GROUP BY SALARY
//ORDER BY SALARY DESC LIMIT 1,1//DUPLICATES WILL BE WAIVED OFF
//
//SELECT MAX(SALARY)
//FROM EMPLOYEE
//GROUP BY SALARY DESC LIMIT 1;
//
//
//sECOND WAY
//SELECT MAX(SALARY)
// FROM EMPLOYEE
// WHERE SALARY <> (SELECT MAX(SALARY) FROM EMPLOYEE