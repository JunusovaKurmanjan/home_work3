package com.example.home_work3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       EditText editTextForEmail = findViewById(R.id.login);
       EditText editTextForTheme = findViewById(R.id.theme);
       EditText editTextForText = findViewById(R.id.dhdhdh);
        Button mainButton = findViewById(R.id.button);

        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(intent.EXTRA_EMAIL,new String[]{editTextForEmail.getText().toString()});
                intent.putExtra(intent.EXTRA_SUBJECT,editTextForTheme.getText().toString());
                intent.putExtra(intent.EXTRA_TEXT,editTextForText.getText().toString());
                intent.setType("message/rfc822");
                startActivity(intent.createChooser(intent,"forIntent"));
            }
        });


    }
}