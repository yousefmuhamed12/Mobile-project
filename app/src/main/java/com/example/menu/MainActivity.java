package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String[] s1,s2;
       Button b;
        int[] images ={R.drawable.dp,R.drawable.mup,R.drawable.marpizza,R.drawable.vp};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.rv);
        s1= getResources().getStringArray(R.array.pizzas);
        s2= getResources().getStringArray(R.array.description);
        MyAdapter myAdapter=new MyAdapter(this,s1,s2,images);
        rv.setAdapter(myAdapter);
        rv.setLayoutManager(new LinearLayoutManager(this));

        b=findViewById(R.id.button);


    }
     public void display(View v){
        // final Toast toast;
         // shows message to the user
         Toast.makeText(MainActivity.this,"Added!",Toast.LENGTH_SHORT).show();

     }

}