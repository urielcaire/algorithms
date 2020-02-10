package main.java;

import main.java.model.MergeSort;

public class MergeMain {
    public static void main(String[] args) {
        int v[] = {12, 11, 13, 5, 6, 7};

        MergeSort msort = new MergeSort();
        msort.sort(v);

        for (int i = 0; i < v.length; i++)
            System.out.print(v[i]+" ");
    }
}
