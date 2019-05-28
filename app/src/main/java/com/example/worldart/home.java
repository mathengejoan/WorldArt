package com.example.worldart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {
    Button btn_display,btn_view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_display=(Button)findViewById(R.id.btn_display);
        btn_display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent patron=new Intent(home.this,Display.class);
                startActivity(patron);

            }
        });

        btn_view=(Button)findViewById(R.id.btn_view);
        btn_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mummy=new Intent(home.this,Art_Styles.class);
                startActivity(mummy);

            }
        });
    }


}
