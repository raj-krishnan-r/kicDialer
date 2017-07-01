package com.example.raj.notesdialer;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button n7 = (Button) findViewById(R.id.button23);
        Button n8 = (Button) findViewById(R.id.button22);
        Button n9 = (Button) findViewById(R.id.button21);
        Button n4 = (Button) findViewById(R.id.button30);
        Button n5 = (Button) findViewById(R.id.button29);
        Button n6 = (Button) findViewById(R.id.button31);
        Button n1 = (Button) findViewById(R.id.button35);
        Button n2 = (Button) findViewById(R.id.button36);
        Button n3 = (Button) findViewById(R.id.button34);
        Button n0 = (Button) findViewById(R.id.button38);
        Button s1 = (Button) findViewById(R.id.button44);
        Button s2 = (Button) findViewById(R.id.button46);

        Button fCall = (Button) findViewById(R.id.button20);
        Button fClear = (Button) findViewById(R.id.button37);
        Button fBack = (Button) findViewById(R.id.button6);

        //final String number = "";
        final StringBuffer number = new StringBuffer();
        final EditText display = (EditText) findViewById(R.id.editText9);
        //  display.setText("0");
        n7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //display.setText("7");
                // number.concat("7");
                //number = number+"7";
                number.insert(number.length(), "7");
                display.setText(number);
            }
        });
        n8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //  displayer((Button) v);
                number.insert(number.length(), "8");
                display.setText(number);

            }
        });
        n9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                number.insert(number.length(), "9");
                display.setText(number);


            }
        });
        n6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                number.insert(number.length(), "6");
                display.setText(number);

            }
        });
        n5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                number.insert(number.length(), "5");
                display.setText(number);

            }
        });
        n4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                number.insert(number.length(), "4");
                display.setText(number);

            }
        });
        n3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                number.insert(number.length(), "3");
                display.setText(number);

            }
        });
        n2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                number.insert(number.length(), "2");
                display.setText(number);

            }
        });
        n1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                number.insert(number.length(), "1");
                display.setText(number);

            }
        });
        n0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                number.insert(number.length(), "0");
                display.setText(number);

            }
        });
        s1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                number.insert(number.length(), "*");
                display.setText(number);

            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                number.insert(number.length(), "#");
                display.setText(number);

            }
        });
        fCall.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + number.toString()));
                if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                startActivity(callIntent);
            }
        });
        fClear.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                number.delete(0,number.length());
                display.setText("");
            }
        });
        fBack.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                if(number.length()!=0) {
                    number.delete(number.length() - 1, number.length());
                    display.setText(number);
                }
            }
        });
    }


}
