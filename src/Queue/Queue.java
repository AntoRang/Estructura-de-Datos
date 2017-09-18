package Queue;

import practica03.LinkedList;

/**
 * Created by AntonioRang on 9/18/17.
 */
public class Queue<E> implements IQueue {


    private LinkedList<E> queue;

    public Queue(){
        queue = new LinkedList<E>();
    }



    public void offer(E element) {

        queue.addFirst(element);

    }

    @Override
    public E remove() {
        return queue.removeLast();
    }

    @Override
    public E element() {
        return queue.getFirst();
    }

    @Override
    public boolean isEmpty() {

        return queue.isEmpty();
    }

    @Override
    public void clear() {

        queue.clear();

    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public Object[] toArray() {
        return queue.toArray();
    }
}
