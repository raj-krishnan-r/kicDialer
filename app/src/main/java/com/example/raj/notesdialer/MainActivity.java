package com.example.raj.notesdialer;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

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

        Button oHistory = (Button) findViewById(R.id.button2);

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
                callIntent.setData(Uri.parse("tel:" +Uri.encode( number.toString())));
                if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
          //Activiteis to gain permission.
                    return;
                }
                startActivity(callIntent);
            }
        });
        fClear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                number.delete(0, number.length());
                display.setText("");
            }
        });
        fBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (number.length() != 0) {
                    number.delete(number.length() - 1, number.length());
                    display.setText(number);
                }
            }
        });
        oHistory.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent init;
                init = new Intent(MainActivity.this,callLog.class);
                MainActivity.this.startActivity(init);
            }
                });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
