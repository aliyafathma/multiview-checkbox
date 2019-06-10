package com.bankmandiri.helloandroid2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.bankmandiri.helloandroid2.adapter.TodoAdapter;
import com.bankmandiri.helloandroid2.model.Todo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button add;
    RecyclerView users;
    CheckBox checkBox;

    TodoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = findViewById(R.id.add);
        users = findViewById(R.id.main_rcv_todo);
        checkBox = findViewById(R.id.checkBox);

        initList();
        add.setOnClickListener(this);
    }

    private void initList() {
        List<Todo> users = new ArrayList<>();
        users.add(new Todo("anka", false));
        users.add(new Todo("ahda", true));

        adapter = new TodoAdapter(users);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        this.users.setLayoutManager(layoutManager);
        this.users.setAdapter(adapter);


    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.add) {
            EditText todo = findViewById(R.id.todo);

            adapter.add(new Todo(todo.getText().toString(), checkBox.isChecked()));
            todo.setText("");
        }

    }
}
