package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = findViewById(R.id.et1);
        final EditText editText2 = findViewById(R.id.et2);
        Button b1 = findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(editText.getText().toString());
                int num2 = Integer.parseInt(editText2.getText().toString());

                Intent intent = new Intent(MainActivity.this, Result.class);
                intent.putExtra("Sum",num1+ "+" +num2+ "=" +(num1+num2));
                startActivity(intent);
            }
        });


    }
}
