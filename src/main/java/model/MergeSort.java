package main.java.model;

public class MergeSort {
    int array[];
    int aux[];

    public MergeSort(){
    }

    /**
     * Receive a vector and return it sorted.
     * @param v a vector to sort
     * @return sorted vector v
     */
    public int[] sort(int[] v){
        this.array = v;
        this.aux = new int[array.length];

        mergeSort(0, array.length - 1);

        return array;
    }

    /**
     * Get a fetch of the array, divide it in two and call mergeSort recursively.
     * Then call merge() to join sorted pieces.
     * @param l low index.
     * @param h high index.
     */
    private void mergeSort(int l, int h){
        if (l < h){
            int mid = (l + h) / 2;
            mergeSort(l, mid);
            mergeSort(mid+1, h);
            merge(l, mid, h);
        }
    }

    /**
     * Receive a lowest, mid and highest index to apply merge.
     * @param l lowest index to apply merge.
     * @param mid middle index.
     * @param h highest internal index to apply merge.
     */
    private void merge(int l, int mid, int h) {
        int i = l;
        int left = l;
        int right = mid + 1;

        while (left <= mid && right <= h) {
            if (array[left] < array[right])
                aux[i++] = array[left++];
            else
                aux[i++] = array[right++];
        }

        while (left <= mid)
            aux[i++] = array[left++];
        while (right <= h)
            aux[i++] = array[right++];

        for (int j = l; j <= h; j++){
            array[j] = aux[j];
        }
    }
}
