package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView userList;
    private ArrayAdapter aAdapter;
    private String[] users = { "This", "Is", "The", "Implementation", "Of", "The", "List", "View"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userList = findViewById(R.id.userList);
        aAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, users);
        userList.setAdapter(aAdapter);
    }
}
