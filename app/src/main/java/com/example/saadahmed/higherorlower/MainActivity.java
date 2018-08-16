package com.example.saadahmed.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import java.util.Random;
import java.util.RandomAccess;

public class MainActivity extends AppCompatActivity {
    Random rand=new Random();
    private int toGuess= rand.nextInt(21);

    public void guess(View view){
        EditText number=(EditText)findViewById(R.id.numberText);
        int guessedNumber=Integer.parseInt(number.getText().toString());

        if (guessedNumber==toGuess){
            toGuess=rand.nextInt(21);
            Toast.makeText(this,"You guessed it right. Guess new number!!",Toast.LENGTH_LONG).show();
        }
        else if(guessedNumber<toGuess){
            Toast.makeText(this,"HIGHER",Toast.LENGTH_LONG).show();

        }
        else{
            Toast.makeText(this,"LOWER",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
