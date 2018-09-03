package com.codeclan.topmovieslist;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class ToDoListMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todo_list);

        ToDoList toDoList = new ToDoList();
        ArrayList<ToDo> list = toDoList.getList();

        ToDoListAdapter movieAdapter = new ToDoListAdapter(this, list);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(movieAdapter);

    }

    public void getMovie(View listItem){
        ToDo toDo = (ToDo) listItem.getTag();
        Log.d("ToDo Title:", toDo.getTitle());

        Intent intent = new Intent(this, ToDoActivity.class );
        intent.putExtra("toDo", toDo);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_addTask:
                final EditText taskEditText = new EditText(this);
                LayoutInflater addTask = LayoutInflater.from(this);
                final View entryView = addTask.inflate(R.layout.input, null);
                //text_entry is an Layout XML file containing two text field to display in alert dialog
                final EditText input1 = (EditText) entryView.findViewById(R.id.title);
                final EditText input2 = (EditText) entryView.findViewById(R.id.details);
//        input1.setText("DefaultValue", TextView.BufferType.EDITABLE)
//        input2.setText("DefaultValue", TextView.BufferType.EDITABLE)
                AlertDialog.Builder dialog = new AlertDialog.Builder(this)

                        .setTitle("Αdd Task")
                        .setView(entryView)
                        .setPositiveButton("Save",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int whichButton) {
                                        Log.i("AlertDialog","TextEntry 1 Entered "+input1.getText().toString());
                                        Log.i("AlertDialog","TextEntry 2 Entered "+input2.getText().toString());
                                        String title = input1.getText().toString();
                                        String details= input2.getText().toString();

                                    }
                                })
                        .setNegativeButton("Cancel",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int whichButton) {
                                    }
                                });
                dialog.show();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
