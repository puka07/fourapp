package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button buttonAdd, buttonSubstract, buttonDivide, buttonMultiply, buttonClean;
    private TextView operation, result;
    private EditText number1, number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSubstract = (Button) findViewById(R.id.buttonSubstract);
        buttonDivide = (Button) findViewById(R.id.buttonDivide);
        buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        buttonClean = (Button) findViewById(R.id.buttonClean);
        operation = (TextView) findViewById(R.id.operation);
        result = (TextView) findViewById(R.id.result);
        number1 = (EditText) findViewById(R.id.number1);
        number2 = (EditText) findViewById(R.id.number2);
        buttonAdd.setOnClickListener(this);
        buttonSubstract.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonClean.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        float num1 = 0;
        float num2 = 0;
        float res = 0;
        num1 = Float.parseFloat(number1.getText().toString());
        num2 = Float.parseFloat(number1.getText().toString());

        int id = v.getId();
        if (id == R.id.buttonAdd) {
            operation.setText("+");
            res = num1 + num2;
        } else if (id == R.id.buttonSubstract) {
            operation.setText("-");
            res = num1 - num2;
        } else if (id == R.id.buttonDivide) {
            operation.setText("/");
            res = num1 / num2;
        } else if (id == R.id.buttonMultiply) {
            operation.setText("*");
            res = num1 * num2;
        } else if (id == R.id.buttonClean) {
            number1.setText("");
            number2.setText("");
            operation.setText("");
            result.setText("");
        }
        result.setText(res+"");
    }
}