package com.codeclan.topmovieslist;


import java.util.ArrayList;

public class ToDoList {

    private ArrayList<ToDo> list;

    public ToDoList() {
        list = new ArrayList<ToDo>();
        list.add(new ToDo(1, "Go to Doctor", "Check Up"));
        list.add(new ToDo(2, "Pay the Rent", "360.00£"));
        list.add(new ToDo(3, "Shopping at Tesco", "weekend grosseries"));
        list.add(new ToDo(4, "Xmas Presents", "family"));
        list.add(new ToDo(5, "Go to Gym", "DanceAerobic at 15:00"));
        list.add(new ToDo(6, "Party Hard", "Kostas is visiting"));
        list.add(new ToDo(7, "Book Flights", "trip to Amsterdam"));
        list.add(new ToDo(8, "Finish CodeClan Homework", "Java Android Project"));
        list.add(new ToDo(9, "Feed the Cat", "Only 120grams"));
        list.add(new ToDo(10, "Feed the Goldfishes", "In the morning"));
        list.add(new ToDo(11, "Feed the Goldfishes to the Cat", ":P who wrote this?"));
        list.add(new ToDo(12, "Pay Dance class", "50£ per month"));
        list.add(new ToDo(13, "Pay codeClan fees", "1500.00£"));
        list.add(new ToDo(14, "Meet up with George", "Yes!"));
    }

    public ArrayList<ToDo> getList() {
        return new ArrayList<ToDo>(list);
    }

}
