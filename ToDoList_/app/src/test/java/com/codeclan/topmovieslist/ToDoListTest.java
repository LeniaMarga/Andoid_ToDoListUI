package com.codeclan.topmovieslist;

import org.junit.Test;
import static org.junit.Assert.*;


public class ToDoListTest {

    @Test
    public void getListTest() {
        ToDoList toDoList = new ToDoList();
        assertEquals(20, toDoList.getList().size());
    }
}