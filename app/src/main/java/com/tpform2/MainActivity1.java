package com.tpform2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity1 extends AppCompatActivity {

    private TextView textV, textV1, textV2;
    private Button btn2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        btn2 = findViewById(R.id.btn2);
        textV = findViewById(R.id.textV);
        textV1 = findViewById(R.id.textV1);
        textV2 = findViewById(R.id.textV2);


        Intent intent = getIntent();

        if(intent != null){
            String textReceived = intent.getStringExtra("text_key");
            String textReceived1 = intent.getStringExtra("text_key1");
            String textReceived2 = intent.getStringExtra("text_key2");
            textV.setText(textReceived);
            textV1.setText(textReceived1);
            textV2.setText(textReceived2);
        }

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}