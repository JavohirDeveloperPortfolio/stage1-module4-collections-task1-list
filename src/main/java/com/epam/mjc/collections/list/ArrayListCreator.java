package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> words = new ArrayList<>();
        int index = 0;
        for (String item : sourceList) {
            if ((index + 1)%3 == 0){
                words.add(item);
                words.add(item);
            }
            index ++;
        }
        return words;
    }
}
