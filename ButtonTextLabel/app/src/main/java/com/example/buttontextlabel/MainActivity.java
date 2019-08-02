package com.example.buttontextlabel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ToggleButton tbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     btn= findViewById(R.id.button1);
     tbtn = findViewById(R.id.toggleButton);


    }

    public void togglebutton(View v){
        if(tbtn.isChecked()){
            Log.e("TogBtn","Button is ON");
            Toast myToast = Toast.makeText(this, "Button is ON", Toast.LENGTH_SHORT);
            myToast.setGravity(Gravity.TOP| Gravity.CENTER_HORIZONTAL, 0, 300);
            myToast.show();
        }
        else{
            Log.e("TogBtn","Button is OFF");
            Toast myToast = Toast.makeText(this, "Button is OFF", Toast.LENGTH_SHORT);
            myToast.setGravity( Gravity.TOP| Gravity.CENTER_HORIZONTAL, 0, 300);
            myToast.show();
        }
    }

    public void btn_Click(View v){
        Log.e("btn_Click", "Hey! It Worked");
        Toast myToast = Toast.makeText(this, "Button is Clicked!", Toast.LENGTH_SHORT);
        myToast.setGravity(Gravity.TOP| Gravity.CENTER_HORIZONTAL, 0, 300);
        myToast.show();
    }

    public void makeToast(View v){
        Toast.makeText(this, "It's got Burned!!", Toast.LENGTH_LONG).show();
    }

    public void nextActivity(View v) {
        String username = "Pavel";
        Intent i = new Intent(this, Main2Activity.class);
        // before start activity
        i.putExtra("intVal", 25);
       // i.putExtra("strVal", "myString");
        i.putExtra("strVal", username);

        startActivity(i);
        Toast.makeText(this, "Moving on!", Toast.LENGTH_LONG).show();
        finish();
    }
}
