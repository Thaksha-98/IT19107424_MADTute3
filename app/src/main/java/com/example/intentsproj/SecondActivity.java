package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
         int number1 = intent.getIntExtra(MainActivity.EXTRA_NUMBER1, 0 );
         int number2 = intent.getIntExtra(MainActivity.EXTRA_NUMBER2, 0 );

         final EditText editText1 = (EditText) findViewById(R.id.editText1);
         final EditText editText2 = (EditText) findViewById(R.id.editText2);

        editText1.setText(number1);
        editText2.setText(number2);

        final TextView result = (TextView) findViewById(R.id.result);

        Button add = (Button) findViewById(R.id.add);
        Button sub = (Button) findViewById(R.id.substract);
        Button multiply = (Button) findViewById(R.id.multiply);
        Button divide = (Button) findViewById(R.id.divide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(editText1.getText().toString());
                int num2 = Integer.parseInt(editText2.getText().toString());
                int result_num = num1+num2;
                TextView no1 = (TextView) findViewById(R.id.num1);
                no1.setText(num1);
                TextView sign = (TextView) findViewById(R.id.sign);
                sign.setText("+");
                TextView no2 = (TextView) findViewById(R.id.num2);
                no2.setText(num2);
                TextView equal = (TextView) findViewById(R.id.equal);
                equal.setText("=");
                result.setText(result_num);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(editText1.getText().toString());
                int num2 = Integer.parseInt(editText2.getText().toString());
                int result_num = num1-num2;
                TextView no1 = (TextView) findViewById(R.id.num1);
                no1.setText(num1);
                TextView sign = (TextView) findViewById(R.id.sign);
                sign.setText("-");
                TextView no2 = (TextView) findViewById(R.id.num2);
                no2.setText(num2);
                TextView equal = (TextView) findViewById(R.id.equal);
                equal.setText("=");
                result.setText(result_num);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(editText1.getText().toString());
                int num2 = Integer.parseInt(editText2.getText().toString());
                int result_num = num1*num2;
                TextView no1 = (TextView) findViewById(R.id.num1);
                no1.setText(num1);
                TextView sign = (TextView) findViewById(R.id.sign);
                sign.setText("*");
                TextView no2 = (TextView) findViewById(R.id.num2);
                no2.setText(num2);
                TextView equal = (TextView) findViewById(R.id.equal);
                equal.setText("=");
                result.setText(result_num);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(editText1.getText().toString());
                int num2 = Integer.parseInt(editText2.getText().toString());
                int result_num = num1/num2;
                TextView no1 = (TextView) findViewById(R.id.num1);
                no1.setText(num1);
                TextView sign = (TextView) findViewById(R.id.sign);
                sign.setText("/");
                TextView no2 = (TextView) findViewById(R.id.num2);
                no2.setText(num2);
                TextView equal = (TextView) findViewById(R.id.equal);
                equal.setText("=");
                result.setText(result_num);
            }
        });


    }

}