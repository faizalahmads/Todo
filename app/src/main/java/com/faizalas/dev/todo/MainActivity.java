package com.faizalas.dev.todo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.faizalas.dev.todo.Adapter.ToDoAdapter;
import com.faizalas.dev.todo.Model.ToDoModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView taskRecycleView;
    private ToDoAdapter tasksAdapter;

    private List<ToDoModel> taskList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        taskRecycleView = findViewById(R.id.tastksRecyclerWiew);
        taskRecycleView.setLayoutManager(new LinearLayoutManager(this));
        tasksAdapter
    }
}