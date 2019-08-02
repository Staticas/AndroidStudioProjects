package com.example.buttontextlabel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText txt;
    TextView disp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        int x = i.getIntExtra( "intVal", 0);
        String str = i.getStringExtra("strVal");

        Log.e( "No 2", str + " | " + x);

        txt = findViewById(R.id.editText2);
        disp = findViewById(R.id.textView3);

        txt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.e("TextWatcher", "From ON Change");
                Log.e("TextWatcher", "s: " + s);
            }
                // part where u can do how much chars left too print
            @Override
            public void afterTextChanged(Editable s) {
                disp.setText(10 - s.length() + "/10");
            }
        });
    }

    public void prevActivity(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        Toast.makeText(this, "Moving on Back!", Toast.LENGTH_LONG).show();
        finish();
    }


}
