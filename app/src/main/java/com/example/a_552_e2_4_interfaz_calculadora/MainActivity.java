package com.example.a_552_e2_4_interfaz_calculadora;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import kotlin.ResultKt;

public class MainActivity extends AppCompatActivity {
    TextView Resultado;
    float num1 = 0.0f;
    float num2 = 0.0f;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar action = getSupportActionBar();
        action.setIcon(R.mipmap.ic_launcher);
        action.setDisplayShowHomeEnabled(true);
        Resultado = findViewById(R.id.resultado);

    }
    public void scrib7 (View view){
        num1 = Float.parseFloat(Resultado.getText().toString());
        if(num1 == 0.0f){
            Resultado.setText("7");
        } else {
            Resultado.setText(Resultado.getText()+"7");
        }
    }
    public void scrib8 (View view){
        num1 = Float.parseFloat(Resultado.getText().toString());
        if(num1 == 0.0f){
            Resultado.setText("8");
        } else {
            Resultado.setText(Resultado.getText()+"8");
        }
    }
    public void scrib9 (View view){
        num1 = Float.parseFloat(Resultado.getText().toString());
        if(num1 == 0.0f){
            Resultado.setText("9");
        } else {
            Resultado.setText(Resultado.getText()+"9");
        }
    }
    public void scrib6 (View view){
        num1 = Float.parseFloat(Resultado.getText().toString());
        if(num1 == 0.0f){
            Resultado.setText("6");
        } else {
            Resultado.setText(Resultado.getText()+"6");
        }
    }
    public void scrib5 (View view){
        num1 = Float.parseFloat(Resultado.getText().toString());
        if(num1 == 0.0f){
            Resultado.setText("5");
        } else {
            Resultado.setText(Resultado.getText()+"5");
        }
    }
    public void scrib4 (View view){
        num1 = Float.parseFloat(Resultado.getText().toString());
        if(num1 == 0.0f){
            Resultado.setText("4");
        } else {
            Resultado.setText(Resultado.getText()+"4");
        }
    }
    public void scrib3 (View view){
        num1 = Float.parseFloat(Resultado.getText().toString());
        if(num1 == 0.0f){
            Resultado.setText("3");
        } else {
            Resultado.setText(Resultado.getText()+"3");
        }
    }
    public void scrib2 (View view){
        num1 = Float.parseFloat(Resultado.getText().toString());
        if(num1 == 0.0f){
            Resultado.setText("2");
        } else {
            Resultado.setText(Resultado.getText()+"2");
        }
    }
    public void scrib1 (View view){
        num1 = Float.parseFloat(Resultado.getText().toString());
        if(num1 == 0.0f){
            Resultado.setText("1");
        } else {
            Resultado.setText(Resultado.getText()+"1");
        }
    }
    public void scrib0 (View view){
        num1 = Float.parseFloat(Resultado.getText().toString());
        if(num1 == 0.0f){
            Resultado.setText("0");
        } else {
            Resultado.setText(Resultado.getText()+"0");
        }
    }
    public void clear (View view){
        Resultado.setText("0");
        num1 = 0.0f;
        num2 = 0.0f;
        operacion = "";
    }
}