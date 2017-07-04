package com.example.mikatekonkatie.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{



    TextView tv;
    TextView tv2;
    Button plus;
    Button plus2;
    Button sub;
    Button sub2;


    int count = 0;
    int count2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView)findViewById(R.id.textView3);
        tv.setOnClickListener(this);
        tv2 = (TextView)findViewById(R.id.textView4);
        tv.setOnClickListener(this);

        plus=(Button)findViewById(R.id.button);
        plus.setOnClickListener(this);
        plus2=(Button)findViewById(R.id.button2);
        plus2.setOnClickListener(this);
        sub=(Button)findViewById(R.id.button3);
        sub.setOnClickListener(this);
        sub2=(Button)findViewById(R.id.button4);
        sub2.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            count = count + 1;
            tv.setText("" + count);
        } else if (v.getId() == R.id.button3) {
            count = count - 1;
            tv.setText("" + count);
        } else if (v.getId() == R.id.button2) {
            count2 = count2 + 1;
            tv2.setText("" + count2);
        } else if (v.getId() == R.id.button4) {
            count2 = count2 - 1;
            tv2.setText("" + count2);
        }
    }
}

