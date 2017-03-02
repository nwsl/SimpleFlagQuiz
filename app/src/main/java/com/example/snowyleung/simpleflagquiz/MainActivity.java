package com.example.snowyleung.simpleflagquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnA = (Button)findViewById(R.id.buttonA);
    Button btnB = (Button)findViewById(R.id.buttonB);
    Button btnC = (Button)findViewById(R.id.buttonC);
    Button btnD = (Button)findViewById(R.id.buttonD);
    final TextView result = (TextView)findViewById(R.id.textViewResult);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result.setText("Correct!");
                Intent startQ2Activity = new Intent(v.getContext(), Main2Activity.class);
                startActivity(startQ2Activity);
            }
        });

        btnA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result.setText("Incorrect!");
                //btnA.setEnabled(false);
            }
        });

        btnB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result.setText("Incorrect!");
                //btnB.setEnabled(false);
            }
        });
        btnD.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result.setText("Incorrect!");
                //btnD.setEnabled(false);
            }
        });
    }
}
