package com.example.imageviewrandomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView img;
    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        img = findViewById(R.id.img);
    }

    public void ace(View view) {
        int diceRoll = rand.nextInt(3) + 1;
        if (diceRoll == 1) img.setImageResource(R.drawable.img1);
        if (diceRoll == 2) img.setImageResource(R.drawable.img2);
        if (diceRoll == 3) img.setImageResource(R.drawable.img3);

    }
}