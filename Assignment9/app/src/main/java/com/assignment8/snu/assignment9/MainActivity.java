package com.assignment8.snu.assignment9;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bt1,bt2,bt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=(Button)findViewById(R.id.button);
        bt2=(Button)findViewById(R.id.button2);
        bt3=(Button)findViewById(R.id.button3);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog=new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Alert Dialog");
                alertDialog.setMessage("Please Check Login Deatils");
                alertDialog.setButton(DialogInterface.BUTTON_POSITIVE,"OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog,int which){
                        Toast.makeText(getApplicationContext(),"You Clicked On OK",Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.show();
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialog=new AlertDialog.Builder(MainActivity.this);
                alertDialog.setTitle("Alert Dialog");
                alertDialog.setMessage("Please Check Your Login Details");
                alertDialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"You Clicked on YES",Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"You Clicked on NO",Toast.LENGTH_SHORT).show();
                        dialogInterface.cancel();
                    }
                });
                alertDialog.show();
            }
        });
       bt3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               AlertDialog.Builder alertDialog=new AlertDialog.Builder(MainActivity.this);
               alertDialog.setTitle("Alert Dialog");
               alertDialog.setMessage("Please Check Your Login Details");
               alertDialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialogInterface, int i) {
                       Toast.makeText(getApplicationContext(),"You Clicked on YES",Toast.LENGTH_SHORT).show();
                   }
               });
               alertDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialogInterface, int i) {
                       Toast.makeText(getApplicationContext(),"You Clicked on NO",Toast.LENGTH_SHORT).show();
                   }
               });
               alertDialog.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialogInterface, int i) {
                       Toast.makeText(getApplicationContext(),"You Clicked on Cancel",Toast.LENGTH_SHORT).show();
                   }
               });
               alertDialog.show();
           }
       });

    }
}
