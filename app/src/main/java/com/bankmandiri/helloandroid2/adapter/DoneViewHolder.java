package com.bankmandiri.helloandroid2.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.bankmandiri.helloandroid2.R;
import com.bankmandiri.helloandroid2.model.Todo;

public class DoneViewHolder extends RecyclerView.ViewHolder {

    private ImageView avatar;
    private TextView name;
    private CheckBox done;

    public DoneViewHolder(@NonNull View itemView) {
        super(itemView);
        avatar = itemView.findViewById(R.id.avatar);
        name = itemView.findViewById(R.id.name);
        done = itemView.findViewById(R.id.done);
    }

    public void bind(Todo todo) {
        name.setText(todo.getName());
        done.setChecked(todo.isDone());
    }
}