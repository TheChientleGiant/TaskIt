package com.shomiimages.taskit;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class TaskActivity extends AppCompatActivity {

    public static final String EXTRA = "TaskExtra";
    private static final String TAG = "TaskActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        Task task = (Task) getIntent().getSerializableExtra(EXTRA);

        EditText taskNameInput = (EditText)findViewById(R.id.task_name);
        Button dateButton = (Button)findViewById(R.id.task_date);
        CheckBox doneBox = (CheckBox)findViewById(R.id.task_done);
        Button saveButton = (Button)findViewById(R.id.save_button);

        taskNameInput.setText(task.getName());
        if (task.getDueDate()==null){
            dateButton.setText(getResources().getString(R.string.no_date));
        }else {
            dateButton.setText(task.getDueDate().toString());
        }
        doneBox.setChecked(task.isDone());

        dateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}
