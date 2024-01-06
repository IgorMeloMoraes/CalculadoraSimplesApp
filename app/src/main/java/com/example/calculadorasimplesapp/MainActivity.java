package com.example.calculadorasimplesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Variaveis Globais
    TextView txtNum1, txtNum2, txtResultado;
    EditText edtNum1, edtNum2;
    Button btnSoma, btnSub, btnMulti, btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hooks
        edtNum1 = findViewById(R.id.edt_numero_1);
        edtNum2 = findViewById(R.id.edt_numero_2);
        txtResultado = findViewById(R.id.txt_resultado);
    }

    // Metodos de Operações (Adição, Subtação, Multiplicação, Divisão)
    public void soma(View view){
        // Faz a comparação dos ids dos botões
        if (view.getId() == R.id.btn_soma){

            // Cria duas variaveis para armazenar os valores dentro dos objetos
            double num1, num2;
            num1 = Double.parseDouble(edtNum1.getText().toString());
            num2 = Double.parseDouble(edtNum2.getText().toString());

            // Variavel e calculo da operação
            double somar;
            somar = num1 + num2;

            // Output da operação
            txtResultado.setText("Resultado da soma = " + somar);
        }
    }

    public void subtracao(View view){
        if (view.getId() == R.id.btn_subtracao){

            double num1, num2;
            num1 = Double.parseDouble(edtNum1.getText().toString());
            num2 = Double.parseDouble(edtNum2.getText().toString());

            double subtrair;
            subtrair = num1 - num2;

            txtResultado.setText("Resultado da subtração = " + subtrair);
        }
    }

    public void multiplicacao(View view){
        if (view.getId() == R.id.btn_multiplicacao){

            double num1, num2;
            num1 = Double.parseDouble(edtNum1.getText().toString());
            num2 = Double.parseDouble(edtNum2.getText().toString());

            double multiplicar;
            multiplicar = num1 * num2;

            txtResultado.setText("Resultado da multiplicação = " + multiplicar);
        }
    }

    public void divisao(View view){
        if (view.getId() == R.id.btn_divisao){

            double num1, num2;
            num1 = Double.parseDouble(edtNum1.getText().toString());
            num2 = Double.parseDouble(edtNum2.getText().toString());

            double dividir;
            dividir = num1 / num2;

            txtResultado.setText("Resultado da divisão = " + dividir);
        }
    }
}