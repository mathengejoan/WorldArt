package com.example.worldart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Signup extends AppCompatActivity {
    EditText ed_name,ed_user,ed_pass,ed_con;
    Button button;
    String fullname,username,password,confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        button=(Button)findViewById(R.id.btn_signup);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fullname=ed_name.getText().toString();
                username=ed_user.getText().toString();
                password=ed_pass.getText().toString();
                confirm=ed_con.getText().toString();



                    Intent today = new Intent(Signup.this, MainActivity.class);
                    startActivity(today);
                }
        });

    }
}
