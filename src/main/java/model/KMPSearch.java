package main.java.model;

import java.util.List;
import java.util.ArrayList;

public class KMPSearch {

    protected String pattern;
    protected String text;
    protected int LPSTable[];//Longest proper Prefix which is also Suffix

    public KMPSearch(String text, String pattern) {
        this.pattern = pattern;
        this.text = text;
        this.generateLPSTable();
    }

    public int[] getLPSTable(){
        return this.LPSTable;
    }

    public void generateLPSTable(){
        this.LPSTable = new int[this.pattern.length()];

        int j = 0;
        int i = 1;
        this.LPSTable[0] = 0;

        while(i < pattern.length()){
            if (this.pattern.charAt(j) != this.pattern.charAt(i)){
                if (j<1) {
                    this.LPSTable[i] = j;
                    i++;
                }else{
                    j = this.LPSTable[j-1];
                }
            }else if (this.pattern.charAt(j) == this.pattern.charAt(i)){
                this.LPSTable[i] = ++j;
                i++;
            }
        }
    }

    public int search(int j){
        int i = 0;

        while (i < this.pattern.length() && j < this.text.length()){
            if (this.pattern.charAt(i) != this.text.charAt(j)){
                if (i<1)
                    j++;
                else
                    i = this.LPSTable[i-1];
            }else if (this.pattern.charAt(i) == this.text.charAt(j)){
                i++;
                j++;
            }
        }

        if (i == this.pattern.length())
            j = j - i;
        else
            j = -1;

        return j;
    }

    public List<Integer> searchAll(){
        List<Integer> occurrences = new ArrayList<>();
        int j = 0;

        while (j >= 0 && j < (this.text.length() - this.pattern.length())){
            j = this.search(j);
            if (j != -1) {
                occurrences.add(j);
                j++;
            }
        }

        return occurrences;
    }
}
