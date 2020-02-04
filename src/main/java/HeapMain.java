package main.java;

import main.java.model.Heap;

public class HeapMain {
    public static void main(String[] args) {
        int v[] = {12, 11, 13, 5, 6, 7};
        Heap heap = new Heap();
        heap.HeapSort(v);
    }
}
