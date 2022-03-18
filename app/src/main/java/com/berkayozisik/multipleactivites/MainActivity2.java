package com.berkayozisik.multipleactivites;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button btnChange2;
    TextView textView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnChange2 = findViewById(R.id.button2);
        textView = findViewById(R.id.textView3);


        Intent intent = getIntent();
        String userName = intent.getStringExtra("userInput");
        textView.setText(userName);

        btnChange2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SayfaDegis();
            }

            @NonNull
            private void SayfaDegis() {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}