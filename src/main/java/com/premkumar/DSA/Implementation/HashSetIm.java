package com.premkumar.DSA.Implementation;

import java.util.*;
import java.util.function.Consumer;

public class HashSetIm<E> implements Iterable<E>{

    Node<E>[] list;
    int size;

    @Override
    public Iterator<E> iterator() {
        return  new HashSetIterator() ;
    }

    private class HashSetIterator implements Iterator<E>
    {
        int index;
        Node<E> current;
       public HashSetIterator(){
       index=0;
       current=null;
       findNextElement();
       }

        private void findNextElement() {
        while
       }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            E value = current.value;
            if (current.next != null) {
                current = current.next;
            } else {
                index++;
                findNextElement();
            }
            return value;
        }

    }
    static class Node<E> {
        E value;
        int hashCode;
        Node<E> next;

        public Node(E value) {
            this.value = value;

        }

        @Override
        public int hashCode() {
            return Objects.hashCode(this.value);
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }
    }

    public HashSetIm() {
        list = new Node[20];
        size = 20;
    }


    public void add(E value) {
        boolean isDuplicate = false;
        Node<E> node = new Node<>(value);
        int hashCode = node.hashCode();
        int index = getIndex(hashCode);
        node.hashCode = hashCode;

        if (list[index] == null) {
            list[index] = node;
        } else {
            Node<E> eNode = list[index];
            if (eNode.hashCode == hashCode && eNode.value.equals(value)) {
                return;
            } else {
                while (eNode.next != null) {
                    if (eNode.next.hashCode == hashCode && eNode.next.value.equals(value)) {
                        isDuplicate = true;
                        break;
                    }
                    eNode = eNode.next;
                }

                if (!isDuplicate) {
                    eNode.next = node;
                }
            }
        }
    }

    private int getIndex(int hashCode)
    {
      return hashCode%size;
    }
    public void print()
    {
        for (Node<E> s:list) {
            if(s!=null)
                while(s!=null) {
                    System.out.println(s.value);
                    s=s.next;
                }
        }
    }

    public static void main(String[] args) {
        HashSetIm<Integer> setIm = new HashSetIm<>();
        setIm.add(7654);
        setIm.add(455);
        setIm.add(7654);
        setIm.add(754);
        setIm.add(754);
        setIm.add(764);
        setIm.add(765);
       // setIm.print();
       Iterator<Integer> s= setIm.iterator();
       while(s.hasNext())
           System.out.println(s.next());

    }

}

