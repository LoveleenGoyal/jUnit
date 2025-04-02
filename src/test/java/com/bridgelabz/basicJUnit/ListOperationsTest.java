package com.bridgelabz.basicJUnit;

import org.junit.jupiter.api.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class ListOperationsTest {
    @Test
    @DisplayName("List Add Element Testing")
    @Order(1)
    public void addElementTest(){
        List<Integer> list=new ArrayList<>();
        ListOperations.addElement(list,10);
        assertTrue(list.contains(10));
    }

    @Test
    @DisplayName("List Remove Element Testing")
    @Order(2)
    public void removeElementTest(){
        List<Integer> list=new ArrayList<>();
        list.add(10);
        ListOperations.removeElement(list,10);
        assertFalse(list.contains(10));
    }

    @Test
    @DisplayName("List Size Testing")
    @Order(3)
    public void getSizeTest(){
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        assertEquals(2,ListOperations.getSize(list));
    }
}
