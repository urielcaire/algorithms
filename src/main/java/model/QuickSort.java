package main.java.model;

public class QuickSort {
    private int[] v;

    public QuickSort(){
    }

    /**
     * Receive an array, apply quickSort and return it sorted.
     * @param v int array
     * @return sorted array
     */
    public int[] quickSort(int[] v){
        this.v = v;
        quickSort(0, v.length - 1);
        return this.v;
    }

    /**
     * Receive the lowest and highest index of a piece of an
     * array and apply quickSort.
     * @param l lowest index of a piece
     * @param h highest index of a piece
     */
    private void quickSort(int l, int h){
        if (l < h){
            int p = partition(l,h);
            quickSort(l, p - 1);
            quickSort(p + 1, h);
        }
    }

    /**
     * Receive the lowest and highest index of a piece of an
     * array and return the index of its pivot.
     * @param l lowest index of a piece
     * @param h highest index of a piece
     * @return index of the pivot
     */
    private int partition(int l, int h){
        int pivot = this.v[l];

        int left = l + 1;
        int right = h;

        while (true){
            while (left < h && this.v[left] < pivot) left++; // stops on a value >= pivot
            while (right > l && this.v[right] >= pivot) right--; // stops a value < pivot

            if(left >= right) break; // stop the loop if the indexes crosses

            // change the positions of values
            int aux = this.v[left];
            this.v[left] = this.v[right];
            this.v[right] = aux;
        }

        // move the pivot
        this.v[l] = this.v[right];
        this.v[right] = pivot;

        return right;
    }
}
