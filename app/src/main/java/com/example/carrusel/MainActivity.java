package com.example.carrusel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnMonedas;
    private Button btnGrados;
    private Button btnMediddas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        btnMonedas = findViewById(R.id.btnMonedas);
        btnGrados = findViewById(R.id.btnGrados);
        btnMediddas = findViewById(R.id.btnMedidas);
    }

    public void irMonedas(View view) {
        Intent intent = new Intent(this, MonedasActivity.class);
        startActivity(intent);
    }

    public void irGrados(View view) {
        Intent intent = new Intent(this, GradosActivity.class);
        startActivity(intent);
    }

    public void irMedidas(View view) {
        Intent intent = new Intent(this, UnidadesActivity.class);
        startActivity(intent);
    }
    public void finalizar(View view) {
        finish();
    }


}