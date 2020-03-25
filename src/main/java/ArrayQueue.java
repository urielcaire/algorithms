package main.java;

public class ArrayQueue {

    public static int queueSize, tail = 0, head = 0, queue[];

    public static void main(String[] args) {
        queueSize = 4; // - 1 (Last position can not be used)
        queue = new int[queueSize];

        enqueue(5);
        enqueue(4);
        enqueue(3);
        System.out.println("Size: " + size());
        dequeue();
        first();
        enqueue(1);
        dequeue();
        dequeue();
        dequeue();
        System.out.println("Size: " + size());
    }

    public static int size(){
        return ((queueSize)-tail+head) % (queueSize);
    }

    public static boolean isEmpty(){
        return tail==head;
    }

    public static void first(){
        if (!isEmpty())
            System.out.println("First value: " + queue[tail]);
    }

    public static void dequeue(){
        if (!isEmpty()){
            System.out.println("Dequeue " + queue[tail]);
            queue[tail] = 0;
            tail = (tail+1) % queueSize;
        }
    }

    public static void enqueue(int value){
        if (size()<queueSize-1) {
            System.out.println("Enqueue " + value);
            queue[head] = value;
            head = (head+1) % queueSize;
        }
    }
}
