package main.java;

public class ArrayStack {
    public static int stackSize, top = -1, stack[];
    public static void main(String[] args) {
        stackSize = 5;
        stack = new int[stackSize];

        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        push(6);
        System.out.println("########################");
        show(top);
        pop();
        pop();
        pop();
        System.out.println("########################");
        top();
        pop();
        pop();
        size();
    }

    public static boolean isFull(){
        return top==(stackSize-1);
    }

    public static void push(int value){
        if (!isFull())
            stack[++top] = value;
        else
            System.out.println("Stack overflow!");
    }

    public static boolean isEmpty(){
        return top < 0;
    }

    public static void pop(){
        if (!isEmpty())
            System.out.println("Removing " + stack[top--]);
    }

    public static void top(){
        if (!isEmpty())
            System.out.println("Top: " + stack[top]);
    }

    public static void size(){
        System.out.println("Stack Size: " + (top+1));
    }

    public static void show(int top){
        if (!isEmpty()) {
            System.out.println(stack[top]);
            if (top > 0)
                show(top-1);
        }
    }
}
