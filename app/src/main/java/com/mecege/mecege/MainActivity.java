package com.mecege.mecege;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addRefreshButton();
        addLoadButton();
        addSendButton();
    }

    public void addRefreshButton() {
        button = (Button) findViewById(R.id.refreshbutton);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                getMessages();
                updateMessageView("Refresh button pressed");
            }
        });
    }

    public void addLoadButton() {
        button = (Button) findViewById(R.id.loadbutton);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                getMessages();
                updateMessageView("Load button pressed");
            }
        });
    }

    public void addSendButton() {
        button = (Button) findViewById(R.id.sendbutton);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessage();
                updateMessageView("Send button pressed");
            }
        });
    }

    public void updateMessageView(String toThis) {
        TextView textView = (TextView) findViewById(R.id.messageview);
        textView.setText(toThis);
    }

    private void getMessages() {
        //TODO: get recent messages from the server
    }

    private void sendMessage() {
        //TODO: send the new message to the server
    }
}

