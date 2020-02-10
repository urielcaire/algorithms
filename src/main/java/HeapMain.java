package main.java;

import main.java.model.HeapSort;

public class HeapMain {
    public static void main(String[] args) {
        int v[] = {12, 11, 13, 5, 6, 7};
        HeapSort heapSort = new HeapSort();
        heapSort.heapSort(v);
    }
}
