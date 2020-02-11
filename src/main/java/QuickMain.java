package main.java;

import main.java.model.QuickSort;

public class QuickMain {
    public static void main(String[] args) {
        int v[] = {12, 11, 13, 5, 6, 7};

        QuickSort qsort = new QuickSort();
        qsort.quickSort(v);

        for (int i = 0; i < v.length; i++)
            System.out.print(v[i]+" ");
    }
}
