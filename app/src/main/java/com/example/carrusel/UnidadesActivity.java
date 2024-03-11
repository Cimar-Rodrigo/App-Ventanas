package com.example.carrusel;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class UnidadesActivity extends AppCompatActivity {
    private Spinner spnUnidad;
    private EditText edtUnidad;
    private TextView txtMm, txtCm, txtDm, txtM, txtInch, txtFt, txtYd, txtMile, txtKm;

    private Button btnConvertirU, btnAtrasU, btnLimpiarU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unidades);
        initComponents();
    }

    public void initComponents(){


        spnUnidad = findViewById(R.id.spnUnidad);
        spnUnidad.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.spinner_items)));
        edtUnidad = findViewById(R.id.edtUnidad);
        txtMm = findViewById(R.id.txtMm);
        txtCm = findViewById(R.id.txtCm);
        txtDm = findViewById(R.id.txtDm);
        txtM = findViewById(R.id.txtM);
        txtInch = findViewById(R.id.txtInch);
        txtFt = findViewById(R.id.txtFt);
        txtYd = findViewById(R.id.txtYd);
        txtMile = findViewById(R.id.txtMile);
        txtKm = findViewById(R.id.txtKm);
        btnConvertirU = findViewById(R.id.btnConvertirU);
        btnAtrasU = findViewById(R.id.btnVolverU);
        btnLimpiarU = findViewById(R.id.btnLimpiarU);
    }

    public void convertirU(View v){
        String unidad = spnUnidad.getSelectedItem().toString();
        //mostrar un mensaje de la unidad seleccionadad

        double valor = Double.parseDouble(edtUnidad.getText().toString());
        double mm = 0, cm = 0, dm = 0, m = 0, inch = 0, ft = 0, yd = 0, mile = 0, km = 0;
        if(unidad.equals("Milimetros")){
            mm = valor;
            cm = valor / 10;
            dm = valor / 100;
            m = valor / 1000;
            inch = valor / 25.4;
            ft = valor / 304.8;
            yd = valor / 914.4;
            mile = valor / 1609344;
            km = valor / 1000000;
        }else if(unidad.equals("Centimetros")){
            mm = valor * 10;
            cm = valor;
            dm = valor / 10;
            m = valor / 100;
            inch = valor / 2.54;
            ft = valor / 30.48;
            yd = valor / 91.44;
            mile = valor / 160934.4;
            km = valor / 100000;
        }else if(unidad.equals("Decimetros")){
            mm = valor * 100;
            cm = valor * 10;
            dm = valor;
            m = valor / 10;
            inch = valor / 0.254;
            ft = valor / 3.048;
            yd = valor / 9.144;
            mile = valor / 16093.44;
            km = valor / 10000;
        }else if(unidad.equals("Metros")){
            mm = valor * 1000;
            cm = valor * 100;
            dm = valor * 10;
            m = valor;
            inch = valor * 39.37;
            ft = valor * 3.281;
            yd = valor * 1.094;
            mile = valor / 1609.344;
            km = valor / 1000;
        }else if(unidad.equals("Pulgadas")){
            mm = valor * 25.4;
            cm = valor * 2.54;
            dm = valor * 0.254;
            m = valor / 39.37;
            inch = valor;
            ft = valor / 12;
            yd = valor / 36;
            mile = valor / 63360;
            km = valor / 39370.079;
        }else if(unidad.equals("Pies")){
            mm = valor * 304.8;
            cm = valor * 30.48;
            dm = valor * 3.048;
            m = valor / 3.281;
            inch = valor * 12;
            ft = valor;
            yd = valor / 3;
            mile = valor / 5280;
            km = valor / 3280.84;
        } else if(unidad.equals("Yardas")){
            mm = valor * 914.4;
            cm = valor * 91.44;
            dm = valor * 9.144;
            m = valor / 1.094;
            inch = valor * 36;
            ft = valor * 3;
            yd = valor;
            mile = valor / 1760;
            km = valor / 1093.613;
        }else if(unidad.equals("Millas")){
            mm = valor * 1609344;
            cm = valor * 160934.4;
            dm = valor * 16093.44;
            m = valor * 1609.344;
            inch = valor * 63360;
            ft = valor * 5280;
            yd = valor * 1760;
            mile = valor;
            km = valor * 1.609;
        }
        else if(unidad.equals("Kilometros")){
            mm = valor * 1000000;
            cm = valor * 100000;
            dm = valor * 10000;
            m = valor * 1000;
            inch = valor * 39370.079;
            ft = valor * 3280.84;
            yd = valor * 1093.613;
            mile = valor / 1.609;
            km = valor;
        }

        //redondear a 4 decimales

        txtMm.setText(String.format("%.4f", mm));
        txtCm.setText(String.format("%.4f", cm));
        txtDm.setText(String.format("%.4f", dm));
        txtM.setText(String.format("%.4f", m));
        txtInch.setText(String.format("%.4f", inch));
        txtFt.setText(String.format("%.4f", ft));
        txtYd.setText(String.format("%.4f", yd));
        txtMile.setText(String.format("%.4f", mile));
        txtKm.setText(String.format("%.4f", km));


    }

    public void limpiar(View v){
        edtUnidad.setText("");
        txtMm.setText("");
        txtCm.setText("");
        txtDm.setText("");
        txtM.setText("");
        txtInch.setText("");
        txtFt.setText("");
        txtYd.setText("");
        txtMile.setText("");
        txtKm.setText("");
    }

    public void volver(View v){
        finish();
    }

}

