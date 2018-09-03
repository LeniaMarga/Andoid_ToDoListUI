package com.codeclan.topmovieslist;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class ToDoTest {

    ToDo toDo;

    @Before
    public void before() {
        toDo = new ToDo(101, "Monty Python and the Holy Grail", 1975);
    }

    @Test
    public void getRankingTest() {
        assertEquals((Integer)101, toDo.getRanking());

    }

    @Test
    public void getTitleTest() {
        assertEquals("Monty Python and the Holy Grail", toDo.getTitle());

    }

    @Test
    public void getYearTest() {
        assertEquals((Integer)1975, toDo.getYear());

    }
}