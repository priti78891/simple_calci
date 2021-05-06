package com.calci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText number1,number2;
    Button add,subtract,multiply,divide;

    float res;
    int n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=(TextView)findViewById(R.id.result);
        number1=(EditText)findViewById(R.id.number1);
        number2=(EditText)findViewById(R.id.number2);
        add=(Button)findViewById(R.id.add);
        subtract=(Button)findViewById(R.id.subtract);
        multiply=(Button)findViewById(R.id.multiply);
        divide=(Button)findViewById((R.id.divide));

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1=Integer.parseInt(number1.getText().toString());
                n2=Integer.parseInt(number2.getText().toString());
                res=n1+n2;
                result.setText(String.valueOf(res));
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1=Integer.parseInt(number1.getText().toString());
                n2=Integer.parseInt(number2.getText().toString());
                res=n1-n2;
                result.setText(String.valueOf(res));
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1=Integer.parseInt(number1.getText().toString());
                n2=Integer.parseInt(number2.getText().toString());
                res=n1*n2;
                result.setText(String.valueOf(res));
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1=Integer.parseInt(number1.getText().toString());
                n2=Integer.parseInt(number2.getText().toString());
                res=n1/n2;
                result.setText(String.valueOf(res));
            }
        });
    }
}