package com.example.cpw;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, MainActivity.class);

        PendingIntent pendingIntent = PendingIntent.getActivity(this,
                0,
                intent,
                PendingIntent.FLAG_CANCEL_CURRENT);

        Button imageButton = (Button) findViewById(R.id.btn1);
        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BluetoothMain.class);
                startActivity(intent);
            }
        });
        Button imageButton1 = (Button) findViewById(R.id.btn2);
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent1 = new Intent(getApplicationContext(), NotificationActivity.class);
                startActivity(intent1);
            }
        });
    }
}