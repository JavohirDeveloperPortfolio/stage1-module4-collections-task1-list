package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    ListComparator listComparator;
    public void sort(List<String> sourceList) {
        int k = 0;
        for (int i = 0; i < sourceList.size(); i++) {
            System.out.println(sourceList.get(i));
            for (int j = i + 1; j < sourceList.size(); j++) {
                listComparator.compare(sourceList.get(i), sourceList.get(j));
            }
        }
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int firstNumber = Integer.parseInt(a);
        int secondNumber = Integer.parseInt(b);
        if ((5 * firstNumber * firstNumber + 3) > (5 * secondNumber * secondNumber + 3)){
            return firstNumber;
        }else {
            return secondNumber;
        }
    }
}
