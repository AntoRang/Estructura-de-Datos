package practica02;

import java.util.NoSuchElementException;

/**
 * Created by AntonioRang on 8/24/17.
 */
public class SLinkedList<E> {

    private SNode<E> top;
    private int size;

    public SLinkedList() {
        top = new SNode<E>();
        size = 0;
    }


    public void addFirst(E e) {

        SNode<E> newNode = new SNode<E>(e);
        newNode.next = top.next;
        top.next = newNode;
        size++;

    }


    public void addLast(E e) {

        SNode<E> newNode= new SNode<E>(e);

        SNode<E> current = top;
        while(current.next != null){
            current = current.next;
        }

        current.next = newNode;
        size++;

    }


    public void add(int index, E element) {
        // TODO Auto-generated method stub

        if(index < 0 || index > size()){
            throw new IndexOutOfBoundsException();
        }


        SNode<E> newNode = new SNode<E>(element);
        newNode.next = top.next;


    }


    public E removeFirst() {

        if(top.next == null){
            throw new NoSuchElementException();
        }

        SNode<E> nodeToRemove = top.next;
        top.next = nodeToRemove.next;
        nodeToRemove.next = null;
        size--;

        return nodeToRemove.value;

    }


    public E removeLast() {

        if(top.next == null){
            throw new NoSuchElementException();
        }

        SNode<E> current = top;

        while(current.next.next!= null){
            current = current.next;
        }

        SNode<E> lastElement= current.next;
        current.next = null;
        size--;
        return lastElement.value;
    }


    public E remove(int index) {
        // TODO Auto-generated method stub
        return null;
    }


    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        return false;
    }


    public E getFirst() {

        if(top.next == null){
            throw new NoSuchElementException();
        }

        return top.next.value;
    }


    public E getLast() {

        if(top.next == null){
            throw new NoSuchElementException();
        }

        SNode<E> current = top;
        while(current.next != null){
            current = current.next;
        }

        return current.value;
    }


    public E get(int index) {
        // TODO Auto-generated method stub
        return null;
    }


    public E set(int index, E element) {
        // TODO Auto-generated method stub
        return null;
    }


    public boolean contains(E e) {
        // TODO Auto-generated method stub
        return false;
    }


    public int indexOf(Object o) {

        int index =0;
        if (o == null){
            for(SNode<E> x =top.next; x != null; x = x.next){
                if(x.value == null) return index;

                index++;
            }
        }else{

            for(SNode<E> x = top.next; x!= null; x=x.next){
                if(o.equals(x.value)){
                    return index;
                }
                index++;
            }
        }

        return -1;
    }


    public void clear() {
        // TODO Auto-generated method stub
        top.next = null;
        size=0;

    }


    public int size() {
        // TODO Auto-generated method stub
        return size;
    }


    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return size() ==0;
    }


    public Object[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }


    public String toString() {

        if(top.next == null) return "[]";

        SNode<E> current = top.next;
        String returnValue = "[" + current.value;

        while(current.next != null){
            current = current.next;
            returnValue += ", " + current.value;
        }

        returnValue += "]";
        return returnValue;
    }
}
