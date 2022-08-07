package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView=findViewById(R.id.textView3);
        TextView textView1=findViewById(R.id.textView5);
        EditText editText=findViewById(R.id.editTextTextPersonName);
        EditText  editText1=findViewById(R.id.editTextTextPersonName3);
        Button button=findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1= Integer.parseInt( editText.getText().toString());
                int num2= Integer.parseInt(editText1.getText().toString());
                int result = num1 + num2;

                textView.setText(String.valueOf(result));


            }
        });



    }
}