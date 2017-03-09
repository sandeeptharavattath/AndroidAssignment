package com.calc.snu.mycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double num1,num2,sum,sub,mul,div;
    Button bt1,bt2,bt3,bt4;
    EditText et1,et2;
    TextView txt1,txt2,txt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=(Button)findViewById(R.id.button);
        bt2=(Button)findViewById(R.id.button2);
        bt3=(Button)findViewById(R.id.button3);
        bt4=(Button)findViewById(R.id.button4);
        et1=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText2);
        txt1=(TextView)findViewById(R.id.textView);
        txt2=(TextView)findViewById(R.id.textView2);
        txt3=(TextView)findViewById(R.id.textView3);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(et1.getText().toString());
                num2 = Double.parseDouble(et2.getText().toString());
                sum = num1 + num2;
                txt3.setText(Double.toString(sum));
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(et1.getText().toString());
                num2 = Double.parseDouble(et2.getText().toString());
                sub=num1-num2;
                txt3.setText(Double.toString(sub));
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(et1.getText().toString());
                num2 = Double.parseDouble(et2.getText().toString());
                mul=num1 * num2;
                txt3.setText(Double.toString(mul));
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(et1.getText().toString());
                num2 = Double.parseDouble(et2.getText().toString());
                div=num1 / num2;
                txt3.setText(Double.toString(div));
            }
        });
    }
}
