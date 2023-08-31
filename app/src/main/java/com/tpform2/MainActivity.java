package com.tpform2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private EditText prnm;

    private EditText nm;

    private EditText phone;

    private Button btn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nm = findViewById(R.id.nm);
        prnm = findViewById(R.id.prnm);
        phone = findViewById(R.id.phn);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nom = nm.getText().toString();
                String prenom = prnm.getText().toString();
                String phn = phone.getText().toString();
                Intent intent = new Intent(MainActivity.this, MainActivity1.class);
                intent.putExtra("text_key", nom);
                intent.putExtra("text_key1", prenom);
                intent.putExtra("text_key2", phn);

                startActivity(intent);
            }
        });
    }
}
