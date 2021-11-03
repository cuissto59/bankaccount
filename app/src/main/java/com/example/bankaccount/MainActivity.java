package com.example.bankaccount;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Login(View v){
                username = findViewById(R.id.usrername);
                password    = findViewById(R.id.login);
                if(Objects.equals(username.getText().toString(),"admin") && Objects.equals(password.getText().toString(),"admin"))
                {
                    //Toast.makeText(MainActivity.this,"You have Authenticated Successfully",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(this,AcceuilActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this,"Authentication Failed",Toast.LENGTH_LONG).show();
                }
            }
        }


