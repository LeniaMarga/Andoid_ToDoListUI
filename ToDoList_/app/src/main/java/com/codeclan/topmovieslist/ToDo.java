package com.codeclan.topmovieslist;


import java.io.Serializable;

public class ToDo implements Serializable{

    private Integer number;
    private String title;
    private String details;



    public ToDo(Integer number, String title, String details) {
        this.number = number;
        this.title = title;
        this.details = details;
    }

    public Integer getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public String getDetails() {return details;}

}
