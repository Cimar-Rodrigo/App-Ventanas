package com.example.carrusel;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MonedasActivity extends AppCompatActivity {

    private Button btnConvertir;
    private Button btnVolver;
    private Button btnLimpiar;

    private TextView txtDolar, txtEuro, txtSol, txtPeso, txtReal, txtYuan, txtYen;
    private EditText edtMonto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monedas);
        initComponents();
    }

    public void initComponents(){
        btnConvertir = findViewById(R.id.btnConvertir);
        btnVolver = findViewById(R.id.btnVolver);
        btnLimpiar = findViewById(R.id.btnLimpiar);

        txtDolar = findViewById(R.id.txtDolar);
        txtEuro = findViewById(R.id.txtEuro);
        txtSol = findViewById(R.id.txtSol);
        txtPeso = findViewById(R.id.txtPeso);
        txtReal = findViewById(R.id.txtReal);
        txtYuan = findViewById(R.id.txtYuan);
        txtYen = findViewById(R.id.txtYen);
        edtMonto = findViewById(R.id.edtMonto);
    }


    public void convertir(View v){
        // El monto esta en bolivianos y redondear a 2 decimales

        double monto = Double.parseDouble(edtMonto.getText().toString());
        // convertir a dos decimales
        monto = Math.round(monto*100.0)/100.0;
        double dolar = Math.round(monto/6.96*100.0)/100.0;
        double euro = Math.round(monto/7.50*100.0)/100.0;
        double sol = Math.round(monto/1.85*100.0)/100.0;
        double peso = Math.round(monto/0.0071*100.0)/100.0;
        double real = Math.round(monto/1.38*100.0)/100.0;
        double yuan = Math.round(monto/0.95*100.0)/100.0;
        double yen = Math.round(monto/0.047*100.0)/100.0;

        txtDolar.setText(String.valueOf(dolar));
        txtEuro.setText(String.valueOf(euro));
        txtSol.setText(String.valueOf(sol));
        txtPeso.setText(String.valueOf(peso));
        txtReal.setText(String.valueOf(real));
        txtYuan.setText(String.valueOf(yuan));
        txtYen.setText(String.valueOf(yen));

    }

    public void limpiar(View v){
        edtMonto.setText("");
        txtDolar.setText("");
        txtEuro.setText("");
        txtSol.setText("");
        txtPeso.setText("");
        txtReal.setText("");
        txtYuan.setText("");
        txtYen.setText("");
    }

    public void volver(View v){
        finish();
    }


}
