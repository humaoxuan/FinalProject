package com.example.iphone.session1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class RegistionActivity extends AppCompatActivity {
    private Button getCode;
    private Button regist;
    private TextView close;
    private TextView phoneNumber;
    private TextView code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_registion);
        init();
    }

    private void init(){
        getCode = findViewById(R.id.getCode);
        regist = findViewById(R.id.login);
        close = findViewById(R.id.close);
        phoneNumber = findViewById(R.id.phoneNumber);
        code = findViewById(R.id.code);
        getCode = findViewById(R.id.getCode);

        getCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCode.setTextColor(Color.BLUE);
                Toast.makeText(getApplicationContext(),"你好啊",Toast.LENGTH_SHORT).show();
            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


}
