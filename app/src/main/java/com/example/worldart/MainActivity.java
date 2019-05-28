package com.example.worldart;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    EditText ed_username,ed_password;
    Button button;
    TextView txt_account,txt_signup;
    String username;
    String password;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

       ed_username=(EditText)findViewById(R.id.us_name);
       ed_password=(EditText)findViewById(R.id.us_pass);

       button=(Button)findViewById(R.id.btn_login);
       button.setOnClickListener(new View.OnClickListener() {

           @Override
           public void onClick(View v) {
               username=ed_username.getText().toString();
               password=ed_password.getText().toString();

               if (((String) username).isEmpty()==true){
                   ed_username.setError("input username");
               }else if (((String) password).isEmpty()==true){
                   ed_password.setError("input password");
               }else {
               Intent toy=new Intent(MainActivity.this,home.class);
               startActivity(toy);
           }


           }
       });

       txt_signup=(TextView)findViewById(R.id.signup);
       txt_signup.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent ham=new Intent(MainActivity.this,Signup.class);
               startActivity(ham);


           }
       });


    }
}
