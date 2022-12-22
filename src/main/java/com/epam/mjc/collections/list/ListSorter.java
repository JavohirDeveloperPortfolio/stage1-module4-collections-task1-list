package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        long firstNumber = Long.parseLong(a);
        long secondNumber = Long.parseLong(b);
        long resultFirst = 5 * firstNumber * firstNumber + 3;
        long resultSecond = 5 * secondNumber * secondNumber + 3;
        int result = Long.compare(resultFirst, resultSecond);
        return result != 0 ? result : Long.compare(firstNumber, secondNumber);
    }
}
