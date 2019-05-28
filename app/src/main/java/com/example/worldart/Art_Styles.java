 package com.example.worldart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

 public class Art_Styles extends AppCompatActivity {
     ListView myList;
     String[] StylesOfArt = {"contemporary", "pop", "Abstract expression", "Art deco","Art nouveau","surrealism","cubism"};
     Integer[] sp_images = {R.drawable.contemporary,R.drawable.pop,R.drawable.deco,R.drawable.nouveau,R.drawable.surrealism,R.drawable.cubism,};

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_art__styles);
         myList = (ListView) findViewById(R.id.listview);


         ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, StylesOfArt);
         myList.setAdapter(adapter);
         myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent=new Intent(getApplicationContext(),View_Activity.class);
                    intent.putExtra("image", sp_images[position]);
                    startActivity(intent);
             }
         });


     }

 }