package com.bridgelabz.basicJUnit;

import java.util.List;

public class ListOperations {
    public static void addElement(List<Integer> list, int x){
        list.add(x);
    }
    public static void removeElement(List<Integer> list, int x){
        list.remove(Integer.valueOf(x));
    }
    public static int getSize(List<Integer> list){
        return list.size();
    }
}
