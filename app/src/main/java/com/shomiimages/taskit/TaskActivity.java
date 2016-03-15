package com.shomiimages.taskit;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class TaskActivity extends AppCompatActivity {

    public static final String EXTRA = "TaskExtra";
    private static final String TAG = "TaskActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        Task task = (Task) getIntent().getSerializableExtra(EXTRA);
        Log.d(TAG, task.getName());
    }

}
