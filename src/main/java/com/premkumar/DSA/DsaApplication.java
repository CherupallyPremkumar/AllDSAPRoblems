package com.premkumar.DSA;

import java.util.HashMap;
import java.util.Stack;

class Ss {
    public static void main(String[] args) {
        countSetBits(5);
    }

    static HashMap<Integer, Integer> hash = new HashMap<>();

    public static int countSetBits(int n) {

        int count = 0;

        for (int i = 1; i <= n; i++) {

            count += convertingIntToBinaryOne(i);

        }
        return count % 1000000007;
    }

    public static int convertingIntToBinaryOne(int num) {
        int count = 0;
        int num1 = num;
        while (num > 0) {
            if (!hash.containsKey(num)) {
                if ((num % 2) == 1) {
                    count++;
                }
            } else {
                count += hash.get(num);
            }
            num = num / 2;
        }
        hash.put(num1, count);
        return count;
    }
}

 class Solution {
     public static void main(String[] args) {
      /*   System.out.println(isValidParenthesis("{{}}{}"));
         String s="ss";
         String sa="ssrr";
         String saa=null;
         System.out.println(s);
         System.out.println(sa);
         saa=s;
         s=sa;
         sa=saa;
         System.out.println(s);
         System.out.println(sa);*/
         int x=44;
       //  System.out.println(x << 29);

meeRecc(100);
     }
    public static boolean isValidParenthesis(String expression) {
        Stack<Character> ss=new Stack<>();
        for(int i=0;i<expression.length();i++)
        {
            if(expression.charAt(i)=='{' || expression.charAt(i)=='(' || expression.charAt(i)=='[')
            {
                ss.push(expression.charAt(i));
            }
            else
            {
                if( expression.charAt(i)=='}' && ss.peek()=='{')
                {
                    ss.pop();
                }else if( expression.charAt(i)==')' && ss.peek()=='(')
                {
                    ss.pop();
                }else if( expression.charAt(i)==']' && ss.peek()=='[')
                {
                    ss.pop();
                }
                else{
                    return false;
                }
            }
            System.out.println();

        }

        return ss.isEmpty();
    }
    public void  me()
    {
        int x=3432432;
        int count=0;
        while(x>0)
        {
            count++;
            x=x/10;
        }
    }
     static public void  me(Integer s)
     {

         int value=0;
         int v=s;
         while(s>0)
         {
             value=value*10+s%10;
             s=s/10;
         }
         System.out.println(value);
         System.out.println(value == v);

     }
     static public void  mee(Integer s)
     {
         int f=1;
         while(s>0)
         {
             f=f*s;
             s=s-1;
         }
         System.out.println(f);
     }
     static public int  meeRec(Integer s)
     {
        if(s==0)
        {
            return 1;
        }
         return s*meeRec(s-1);
     }
     static public void   meeRecc(Integer s)
     {
         int re=0;
         for (int i = 5; i <=s ; i=i*5) {
             re=re+s/i;
         }
         System.out.println(re);
     }
     public int gcd(int a ,int b)
     {
         if(b==0) return a;
         else return gcd(b,a%b);
     }
     public int gcdd(int a,int b )
     {
         while(a!=b)
         {
             if(a>b) a=a-b;
             else b=b-a;
         }
         return a;
     }
}