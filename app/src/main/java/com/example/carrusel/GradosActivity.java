package com.example.carrusel;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GradosActivity extends AppCompatActivity {

    private EditText edtGrado;
    private TextView txtGrado;
    private Button btnConvertirG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grados);
        initComponents();
    }

    public void initComponents(){
        edtGrado = findViewById(R.id.edtGrado);
        txtGrado = findViewById(R.id.txtGrado);
        btnConvertirG = findViewById(R.id.btnConvertirG);
    }

    public void convertir(View v){
        double grado = Double.parseDouble(edtGrado.getText().toString());
        double farenheit = Math.round((grado*1.8+32)*100.0)/100.0;
        String resultado = edtGrado.getText() + "°C= " + String.valueOf(farenheit)+"°F";
        txtGrado.setText(resultado);
    }

    public void limpiar(View v){
        edtGrado.setText("");
        txtGrado.setText("");
    }

    public void volver(View view) {
        finish();
    }


}
