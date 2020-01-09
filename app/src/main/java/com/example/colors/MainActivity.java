package com.example.colors;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button redButton,blueButton,greenButton,backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redButton = (Button)findViewById(R.id.redButton);
        blueButton = (Button)findViewById(R.id.blueButton);
        greenButton = (Button)findViewById(R.id.greenButton);
        backButton = (Button)findViewById(R.id.backButton);

        blueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.fragment_container,new Fragment1()).commit();
                Toast.makeText(MainActivity.this,"Color changed to blue",Toast.LENGTH_LONG).show();
            }
        });

        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.fragment_container,new Fragment2()).commit();
                Toast.makeText(MainActivity.this,"Color changed to red",Toast.LENGTH_LONG).show();
            }
        });

        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.fragment_container,new Fragment3()).commit();
                Toast.makeText(MainActivity.this,"Color changed to green",Toast.LENGTH_LONG).show();
            }
        });
    }
}
