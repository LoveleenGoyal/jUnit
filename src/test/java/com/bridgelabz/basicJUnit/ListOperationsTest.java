package com.bridgelabz.basicJUnit;

import org.junit.jupiter.api.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class ListOperationsTest {
    static List<Integer> list;
    @BeforeAll
    static void setList() {
        list = new ArrayList<>();
        ListOperations.addElement(list, 20);
        ListOperations.addElement(list, 10);
    }
    @Test
    @DisplayName("List Add Element Testing")
    @Order(1)
    public void addElementTest(){
        ListOperations.addElement(list,30);
        assertTrue(list.contains(20));
    }

    @Test
    @DisplayName("List Remove Element Testing")
    @Order(2)
    public void removeElementTest(){
        ListOperations.removeElement(list,10);
        assertFalse(list.contains(10));
    }

    @Test
    @DisplayName("List Size Testing")
    @Order(3)
    public void getSizeTest(){
        assertEquals(1,ListOperations.getSize(list));
    }
}
