package com.example.guessthenum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Hard_level extends AppCompatActivity {

    int count = 0,played=8;
    TextView tvplayed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard_level);

        Random random = new Random();
        int randomNumber = random.nextInt(100)+1;
        Button btnEnter = findViewById(R.id.hbtnEnter);
        tvplayed = findViewById(R.id.htvplayed);
        tvplayed.setText("Chances left "+played);
        btnEnter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                played--;
                tvplayed.setText("Chances left "+(played));
                EditText edtguess = findViewById(R.id.hedtguess);
                String guessedt = edtguess.getText().toString();
                int GuessedNum = Integer.parseInt(guessedt);

                if (count < 8){
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
                if (count >= 8){
                    setContentView(R.layout.loose);
                }


            }
        });
    }
}