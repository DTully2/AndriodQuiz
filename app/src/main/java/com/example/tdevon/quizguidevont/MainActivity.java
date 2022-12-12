package com.example.tdevon.quizguidevont;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.button.MaterialButtonToggleGroup;

public class MainActivity extends AppCompatActivity {
    TextView textViewColor;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewColor = findViewById(R.id.answer);
        radioGroup = findViewById(R.id.radioGroup);


    }

    public void onRadioClick(View view) {

        switch (view.getId()){

            case R.id.radioButton6:
                textViewColor.setText("You are Correct");
                textViewColor.setBackgroundColor(Color.GREEN);
                textViewColor.setTextColor(Color.BLACK);




                break;
            case R.id.radioButton2:
            case R.id.radioButton:
            case R.id.radioButton3:
                textViewColor.setText("Sorry Wrong");
                textViewColor.setBackgroundColor(Color.BLUE);
                textViewColor.setTextColor(Color.WHITE);
                break;

            case R.id.Clear:
                textViewColor.setText("");
                textViewColor.setBackgroundColor(Color.WHITE);
                textViewColor.setTextColor(Color.WHITE);

                radioGroup.clearCheck();
                break;

            default:
                textViewColor.setText("Something went wrong");
        }


    }
}