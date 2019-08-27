package com.example.lunchmodetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startSingleInstanceAffActivity(View view) {
        Intent intent = new Intent(MainActivity.this,SingleInstanceWithAffinityActivity.class);
        startActivity(intent);
    }

    public void startSingleTopActivity(View view) {
        Intent intent = new Intent(MainActivity.this,SingleTaskActivity.class);
        startActivity(intent);
    }

    public void startStandActivity(View view) {
        Intent intent = new Intent(MainActivity.this,StandardActivity.class);
        startActivity(intent);
    }

    public void startSingleTaskActivity(View view) {
        Intent intent = new Intent(MainActivity.this,SingleTaskActivity.class);
        startActivity(intent);
    }

    public void startSingleTaskAffActivity(View view) {
        Intent intent = new Intent(MainActivity.this,SingleTaskWithAffinity.class);
        startActivity(intent);
    }

    public void startSingleInstanceActivity(View view) {
        Intent intent = new Intent(MainActivity.this,SingleInstanceActivity.class);
        startActivity(intent);
    }
}
