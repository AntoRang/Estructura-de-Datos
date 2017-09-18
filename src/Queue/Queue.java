package Queue;

import practica03.LinkedList;

/**
 * Created by AntonioRang on 9/18/17.
 */
public class Queue<E> implements IQueue {


    private LinkedList<E> queue;
    private int size;


    @Override
    public void offer(Object o) {

    }

    @Override
    public Object remove() {
        return null;
    }

    @Override
    public Object element() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

        size=0;

    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }
}
