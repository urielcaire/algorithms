package main.java.model;

public class BinarySearch {
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
}
