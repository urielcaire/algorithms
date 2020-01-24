package main.java.model;

public class BinarySearch {

    private int v[];
    private int target;

    public BinarySearch(){

    }

    public int iterativeBSearch(int v[], int target){
        int l = 0, h = (v.length - 1);

        while (l <= h) {
            int mid = (int) (l + h) / 2;

            if(v[mid]==target)
                return mid;
            else if (target > v[mid])
                l = mid+1;
            else if (target < v[mid])
                h = mid - 1;
        }

        return -1;
    }

    public int recursiveBMethod (int v[], int target){
        this.v = v;
        this.target = target;
        int l = 0;
        int h = v.length - 1;

        return recursiveBMethod(l, h);
    }

    private int recursiveBMethod(int l, int h){
        // T(n) = T(n/2) + 1
        // T(n) = O(log n)
        if(l <= h){
            int mid = (int) (l + h) / 2;

            if(this.v[mid]==this.target)
                return mid;
            else if (this.target > this.v[mid])
                return recursiveBMethod(mid+1, h);
            else if (this.target < this.v[mid])
                return recursiveBMethod(l, mid-1);
        }

        return -1;
    }
}
