package com.example.mynotclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Ir_temas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ir_temas = (Button)FindViewByID(R.id.imageButton_buscador);
        Ir_temas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ir_temas = new Intent(MainActivity.this, Temas.class);
                startActivity(Ir_temas);
            }
        });
    }
}
