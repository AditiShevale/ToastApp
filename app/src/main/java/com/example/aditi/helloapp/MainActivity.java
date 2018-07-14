package com.example.aditi.helloapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button mButton1 , mButton2;
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mTextView=(TextView) findViewById(R.id.textView);
        mButton1 = (Button) findViewById(R.id.button);
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Change1", Toast.LENGTH_SHORT).show();

            }
        });


    }
    //SecondWay To Create OnClickListener
    public  void  doSomething(View v){
        Toast.makeText(this, "Change2", Toast.LENGTH_SHORT).show();
    }
}
