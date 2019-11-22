package com.example.optionsmenu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, "Item Selected"+item.getTitle(), Toast.LENGTH_SHORT);
        switch(item.getItemId()) {
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
                return super.onOptionsItemSelected(item);
        }
    }

}
