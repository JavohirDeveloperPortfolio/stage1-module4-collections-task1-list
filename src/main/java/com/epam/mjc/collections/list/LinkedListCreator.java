package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> integers = new LinkedList<>();
        for (Integer integer : sourceList) {
            if (integer % 2 == 1){
                integers.addFirst(integer);
            }else {
                integers.add(integer);
            }
        }
        return integers;
    }
}
