package com.example.guessthenum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class select_level extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_level);

Button easymode=findViewById(R.id.easy_button);
Button hardmode=findViewById(R.id.hard_button);

easymode.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent inext;
        inext=new Intent(select_level.this,MainActivity.class);
       startActivity(inext);
    }
});
hardmode.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent ihard;
        ihard=new Intent(select_level.this,Hard_level.class);
   startActivity(ihard);
    }
});


    }
}