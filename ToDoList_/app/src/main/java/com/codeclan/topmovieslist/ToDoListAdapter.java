package com.codeclan.topmovieslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ToDoListAdapter extends ArrayAdapter<ToDo> {


    public ToDoListAdapter(Context context, ArrayList<ToDo> movies) {
        super(context, 0, movies);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.todo_item, parent, false);
        }

        ToDo currentToDo = getItem(position);

        TextView number = (TextView) listItemView.findViewById(R.id.number);
        number.setText(currentToDo.getNumber().toString());

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentToDo.getTitle().toString());

//        TextView details = (TextView) listItemView.findViewById(R.id.details);
//        details.setText(currentToDo.getDetails().toString());


        listItemView.setTag(currentToDo);

        return listItemView;

    }
}
