package com.premkumar.DSA.Implementation;

import java.util.*;
import java.util.function.Consumer;

public class HashSetIm<E> implements Iterable<E>, Cloneable {

    private Node<E>[] list;
    private int size;
    private int modCount = 0;

    @Override
    public Iterator<E> iterator() {
        return new HashSetIterator();
    }

    @Override
    public HashSetIm<E> clone() {
        try {
            HashSetIm<E> clone = (HashSetIm<E>) super.clone();
            clone.list = list.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    private class HashSetIterator implements Iterator<E> {
        int index;
        Node<E> current;

        public HashSetIterator() {
            index = 0;
            current = null;
            findNextElement();
        }

        private void findNextElement() {
            while (index < size && list[index] == null) {
                index++;
            }
            if (index < size) {
                current = list[index];
            } else {
                current = null;
            }
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


    public Boolean add(E value) {
        boolean isDuplicate = false;
        Node<E> node = new Node<>(value);
        int hashCode = node.hashCode();
        int index = getIndex(hashCode);
        node.hashCode = hashCode;

        if (list[index] == null) {
            list[index] = node;
            modCount++;
            return true;
        } else {
            Node<E> eNode = list[index];
            if (eNode.hashCode == hashCode && eNode.value.equals(value)) {
                return false;
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
                    modCount++;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean contains(E o) {
        int hash = Objects.hashCode(o);
        int index = getIndex(hash);
        if (list[index] == null) return false;
        else {
            Node<E> eNode = list[index];
            if (eNode.hashCode == hash && eNode.value.equals(o)) {
                return true;
            } else {
                while (eNode.next != null) {
                    if (eNode.next.hashCode == hash && eNode.next.value.equals(o)) {
                        return true;
                    }
                }
            }
        }
        return false;

    }


    public Boolean remove(E element) {
        int hash = Objects.hashCode(element);
        int index = getIndex(hash);
        if (list[index] == null) return false;
        else {
            Node<E> eNode = list[index];
            if (eNode.hashCode == hash && eNode.value.equals(element)) {
                Node<E> next = eNode.next;
                list[index] = next;
                modCount--;
                return true;
            } else {
                while (eNode.next != null) {
                    if (eNode.next.hashCode == hash && eNode.next.value.equals(element)) {
                        eNode.next = eNode.next.next;
                        modCount--;
                        return true;
                    }
                }
            }
        }
        return false;
    }


    private int getIndex(int hashCode) {
        return hashCode % size;
    }

    public void print() {
        for (Node<E> s : list) {
            if (s != null)
                while (s != null) {
                    System.out.println(s.value);
                    s = s.next;
                }
        }
    }

    public int size() {
        return modCount;
    }

    public boolean isEmpty() {
        return modCount == 0;
    }

    public void clear() {
        Node<E>[] tab;
        if ((tab = list) != null && modCount > 0) {
            modCount = 0;
            Arrays.fill(tab, null);
        }
    }

    public Object[] toArray() {
        return toArray(new Object[modCount]);
    }

    private Object[] toArray(Object[] a) {
        Object[] r = a;
        int idx = 0;
        Node<E>[] node;
        if (size > 0 && (node = list) != null) {
            for (Node<E> e : node) {
                for (; e != null; e = e.next) {
                    r[idx++] = e.value;
                }
            }
        }
        return r;
    }

    public static void main(String[] args) {
        HashSetIm<Integer> setIm = new HashSetIm<>();
        System.out.println(setIm.isEmpty());
        setIm.add(1);
        setIm.add(2);
        setIm.add(3);
        setIm.add(4);
        setIm.add(5);
        setIm.add(6);
        setIm.add(7);
        setIm.add(7);
        setIm.add(8);
        setIm.add(8);
        // setIm.print();
        setIm.clear();
        Iterator<Integer> s = setIm.iterator();
        while (s.hasNext())
            System.out.println(s.next());
        System.out.println(setIm.contains(3));
        System.out.println("ss" + setIm.size());
        setIm.add(3);
        setIm.add(4);
        setIm.add(5);
        setIm.add(6);
        setIm.add(7);
        setIm.add(7);
        setIm.add(8);
        setIm.add(8);
        setIm.remove(3);

        System.out.println("??????????");
        Iterator<Integer> ss = setIm.iterator();
        while (ss.hasNext())
            System.out.println(ss.next());
        System.out.println(setIm.contains(3));
        System.out.println("ss" + setIm.size());
        System.out.println(setIm.isEmpty());
        HashSetIm<Integer> sss = setIm.clone();
        for (Integer sq : sss) {
            System.out.println(sq);
            sss.add(12);
        }
        System.out.println(sss.size());
        System.out.println(Arrays.toString(sss.toArray()));
    }


}

class A {
    public static void main(String[] args) {
       /* HashSet<Integer> main = new HashSet<>();
        main.add(12);
        main.add(12);
        main.add(1);
        main.add(1);

        for (Integer s : main) {
            System.out.println(s);
        }
        main.remove(12);
        for (Integer s : main) {
            System.out.println(s);
        }*/
        HashSetIm<Integer> mine = new HashSetIm<>();
        mine.add(12);
        mine.add(12);
        mine.add(1);
        mine.add(1);
        for (Integer s : mine) {
            System.out.println("number" +s);
        }
        mine.remove(1);
        for (Integer s : mine) {
            System.out.println(s);
        }
    }
}

