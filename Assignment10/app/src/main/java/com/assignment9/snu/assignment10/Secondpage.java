package com.assignment9.snu.assignment10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Secondpage extends AppCompatActivity {

    TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);
        txt1=(TextView)findViewById(R.id.textView2);
        Intent intent=getIntent();
       String names= intent.getStringExtra("value1");
        txt1.setText(names);
    }
}
