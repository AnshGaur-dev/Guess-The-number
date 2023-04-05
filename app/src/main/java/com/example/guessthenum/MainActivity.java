package com.example.guessthenum;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int count = 0,played=6;
    TextView tvplayed;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();
        int randomNumber = random.nextInt(50)+1;
        Button btnEnter = findViewById(R.id.btnEnter);
        tvplayed = findViewById(R.id.tvplayed);
        tvplayed.setText("Chances left "+played);
        btnEnter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                played--;
                tvplayed.setText("Chances left "+(played));
                EditText edtguess = findViewById(R.id.edtguess);
                String guessedt = edtguess.getText().toString();
                int GuessedNum = Integer.parseInt(guessedt);

                if (count < 6){
                    if (GuessedNum == randomNumber) {
                        setContentView(R.layout.winner);
                    } else if (GuessedNum > randomNumber) {
                        count++;
                        Toast.makeText(getApplicationContext(), "Try shorter number", Toast.LENGTH_SHORT).show();
                    } else if (GuessedNum < randomNumber) {
                        count++;
                        Toast.makeText(getApplicationContext(), "Try greater number", Toast.LENGTH_SHORT).show();
                    }
                }
                if (count >= 6){
                    setContentView(R.layout.loose);
                }


            }
        });
    }
}