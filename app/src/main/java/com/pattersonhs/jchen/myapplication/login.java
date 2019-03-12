package com.pattersonhs.jchen.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText usernameEdit;
    EditText passwordEdit;
    Button loginSubmit;
    int toastMessageID;
    String password;
    String username;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEdit = (EditText) findViewById(R.id.usernameEdit);
        passwordEdit = (EditText) findViewById(R.id.passwordEdit);
        loginSubmit = (Button) findViewById(R.id.loginSubmit);

        password = passwordEdit.getText().toString().trim();
        username = usernameEdit.getText().toString().trim();
        toastMessageID = R.string.wrongPassUser;

        loginSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (usernameEdit.equals("12345") && passwordEdit.equals("admin") )
                {
                    Intent Intent1 = new Intent(login.this, MainActivity.class);
                    startActivity(Intent1);
                }
                else
                {
                    Toast.makeText(login.this,toastMessageID,Toast.LENGTH_SHORT).show();
                    //Intent Intent1 = new Intent(login.this, MainActivity.class);
                    //startActivity(Intent1);
                }

            }
        });
    }

}
