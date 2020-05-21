package main.java;

import main.java.model.KMPSearch;
import java.util.List;
import java.util.ArrayList;

public class KMPMain {
    public static void main(String[] args) {
        String text = "abaacababab";
        String pattern = "abab";

        KMPSearch kmpSearch = new KMPSearch(text, pattern);
        List<Integer> occurrences = kmpSearch.searchAll();

        System.out.println(occurrences.size() + " occurence(s) found.");

        if (occurrences.size()>0){
            System.out.println("Indexes: ");
            for (int i = 0; i < occurrences.size(); i++){
                System.out.print("["+occurrences.get(i)+"] ");
            }
        }
    }
}

