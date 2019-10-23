package com.example.dicegame;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    int count =0;
public void Random_Number_Generator (View view) {

   // level 1
    TextView txt = this.findViewById(R.id.TextView);
    EditText editText = this.findViewById(R.id.textview2);
    TextView txt2 = this.findViewById(R.id.textview5);
    Random R = new Random();
    int rand = 0;
    while (true){
        rand = R.nextInt(7);
        if (rand !=0) break;
    }
    txt.setText(Integer.toString(rand));


// Level 2
    int num = Integer.parseInt(editText.getText().toString());

    if ((num < 1 || num > 6)== false) {
    }
    else
    {
        Toast.makeText(this,"Error", Toast.LENGTH_SHORT).show();
    }
if (num == rand ){
    count++;
    txt2.setText(Integer.toString(count));
    Toast.makeText(this,"Congratulation", Toast.LENGTH_SHORT).show();

}

    }


    }





