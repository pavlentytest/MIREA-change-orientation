package ru.samsung.itschool.mdev.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter = 1;
    private TextView tv;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        tv = findViewById(R.id.result);

        if(savedInstanceState != null) {
            counter = savedInstanceState.getInt("value");
        }

        tv.setText(Integer.toString(counter));

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               counter++;
               tv.setText(Integer.toString(counter));
            }
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putInt("value",counter);
        super.onSaveInstanceState(outState);
    }
}