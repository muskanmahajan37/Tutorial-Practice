package com.example.popupmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(MainActivity.this, v);
                popup.setOnMenuItemClickListener(MainActivity.this);
                popup.inflate(R.menu.popup_menu);
                popup.show();
            }
        });
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        Toast.makeText(this, "Item Selected", Toast.LENGTH_SHORT);
        switch (item.getItemId()) {
            case R.id.menu1:
                Toast.makeText(this, "Menu1 Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu2:
                Toast.makeText(this, "Menu2 Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu3:
                Toast.makeText(this, "Menu3 Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu4:
                Toast.makeText(this, "Menu4 Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu5:
                Toast.makeText(this, "Menu5 Selected", Toast.LENGTH_SHORT).show();
                return true;
                default:
                    return false;
        }
    }
}
