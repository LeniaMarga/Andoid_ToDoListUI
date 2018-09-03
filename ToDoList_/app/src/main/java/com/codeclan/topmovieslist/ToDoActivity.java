package com.codeclan.topmovieslist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ToDoActivity extends AppCompatActivity {

    TextView title,details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);

        Intent intent = getIntent();
        ToDo toDo = (ToDo)intent.getSerializableExtra("toDo");
        Log.d("ToDo Title:", toDo.getTitle());

        title = findViewById(R.id.title);
        title.setText(toDo.getTitle().toString());

        details = (TextView)findViewById(R.id.details);
        details.setText(toDo.getDetails().toString());
    }
}
