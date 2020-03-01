package com.soushetty.implicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //using the implicit intent
                Intent intent=new Intent(Intent.ACTION_SEND); //invoking the action_send final variable  of intent Class
                intent.setType("text/plain"); //type of value we are going to send
                intent.putExtra(Intent.EXTRA_TEXT,"THIS IS THE MESSAGE PASSED USING IMPLICIT INTENTS!!!");//what text should be included in the message
                intent.putExtra(Intent.EXTRA_SUBJECT,"Hope it works fine!"); //how the subject of the mail should be
                startActivity(intent);

            }
        });

    }
}
