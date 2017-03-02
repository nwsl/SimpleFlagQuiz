package com.example.snowyleung.simpleflagquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.button;

public class Main2Activity extends AppCompatActivity {

    Button btn2A = (Button)findViewById(R.id.button2A);
    Button btn2B = (Button)findViewById(R.id.button2B);
    Button btn2C = (Button)findViewById(R.id.button2C);
    Button btn2D = (Button)findViewById(R.id.button2D);
    final TextView result2 = (TextView)findViewById(R.id.textViewResult2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result2.setText("Correct!");
            }
        });

        btn2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result2.setText("Incorrect!");
            }
        });

    }
}
