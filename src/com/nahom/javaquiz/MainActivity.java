package com.nahom.javaquiz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ScrollView;



import android.graphics.Color;

public class MainActivity extends Activity
{
    private Button mainButton;
    private TextView titleLabel;
    private EditText answerField;
    private TextView[] questions=new TextView[20];
    private EditText[] answers=new EditText[20];
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        GridLayout layout=new GridLayout(this);
        ScrollView verticalScroll=new ScrollView(this);
        mainButton=new Button(this);
        mainButton.setText("Select Quiz");
        titleLabel=new TextView(this);
        titleLabel.setText("Java Questions and answers");
        titleLabel.setBackgroundColor(Color.BLUE);
        answerField=new EditText(this);
        answerField.setText("your answers here");
        layout.setColumnCount(1);
        layout.addView(mainButton);
        layout.addView(titleLabel);
        layout.addView(answerField);
        for(int i=0;i<20;i++){
            questions[i]=new TextView(this);
            questions[i].setText((i+1)+" Question number: "+(i+1));
            questions[i].setBackgroundColor(Color.YELLOW);
            answers[i]=new EditText(this);
            answers[i].setText("Your answer here");
            layout.addView(questions[i]);
           layout.addView(answers[i]);
            
        }
        verticalScroll.addView(layout);
        setContentView(verticalScroll);
    }
}
