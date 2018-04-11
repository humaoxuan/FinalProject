package com.example.iphone.session1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private Button loginBtn;
    private TextView close;
    private TextView registion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);
        init();
    }
    private void init(){
        registion = findViewById(R.id.registion);
        registion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,RegistionActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
