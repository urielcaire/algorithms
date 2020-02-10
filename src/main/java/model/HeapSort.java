package main.java.model;

public class HeapSort {

    public void heapSort(int v[]){
        // build the heap
        build(v);

        // extract roots to sort the array
        for (int i = v.length - 1; i >= 0; i--){
            swap(v, 0, i);// move root to end
            heapify(v,0,i);// apply heapify on root
        }

        System.out.println("Sorted array");
        for (int i = 0; i < v.length; i++)
            System.out.print(v[i]+" ");
    }
    /**
     * Heapify/sift a subtree rooted with node i.
     * @param v heap
     * @param i root node
     * @param n heap size
     */
    private void heapify(int v[], int i, int n){
        int largest = i; // root node
        int left = (2*i) + 1; // left leaf
        int right = (2*i) + 2; // right leaf

        if (left < n && v[left] > v[largest])
            largest = left;

        if (right < n && v[right] > v[largest])
            largest = right;

        if (largest!=i) { // check if root was changed
            swap(v, i, largest); // swap node values
            heapify(v, largest, n); // Recursively heapify/sift the sub-tree
        }

    }

    /**
     * Creates a heap structure with a given int vector.
     * @param v int vector
     */
    private void build(int v[]){
        for (int i = (v.length / 2) - 1; i >= 0; i--)
            heapify(v, i, v.length);
    }

    /**
     * Do a swap on a vector.
     * @param v vector
     * @param i destination index
     * @param j source index
     */
    private void swap(int v[], int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }
}
