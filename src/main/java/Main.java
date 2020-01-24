package main.java;

import main.java.model.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int v[] = {32,67,89};
        int target = 67;

        BinarySearch binSearch = new BinarySearch();
        System.out.println("The key of target["+target+"] is: " + binSearch.iterativeBSearch(v,target));
    }
}
