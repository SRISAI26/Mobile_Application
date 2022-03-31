package com.example.scientific_cal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    Button Add;
    Button Sub;
    Button Div;
    Button Mul;
    Button Mod;
    Button Sin;
    Button Cos;
    Button Tan;
    Button Pow;
    Button Sqrt;
    Button Log;
    Button Lan;
    Button Equal;
    Button Ac;
    EditText value;
    Stack<Character> operation;
    int result;
    int c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Add = (Button) findViewById(R.id.add);
        Sub = (Button) findViewById(R.id.sub);
        Mul = (Button) findViewById(R.id.mul);
        Div = (Button) findViewById(R.id.div);
        Mod = (Button) findViewById(R.id.mod);
        Sin = (Button) findViewById(R.id.sin);
        Cos = (Button) findViewById(R.id.cos);
        Tan = (Button) findViewById(R.id.tan);
        Pow = (Button) findViewById(R.id.power);
        Lan = (Button) findViewById(R.id.ln);
        Log = (Button) findViewById(R.id.log);
        Sqrt = (Button) findViewById(R.id.sqrt);
        Equal = (Button) findViewById(R.id.equal);
        Ac = (Button) findViewById(R.id.ac);
        value = (EditText) findViewById(R.id.valuebox);
        operation = new Stack<>();
        c = 1;
        result = 0;

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int v = Integer.parseInt(value.getText().toString());
                value.setText("");
                System.out.println(v);
                operation.push('+');
                result  = result + v;
                System.out.println(result);
            }
        });
        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int v = Integer.parseInt(value.getText().toString());
                value.setText("");
                operation.push('-');

                if(c == 1)
                {
                    result  = result + v;
                }
                else
                {
                    result = result - v;

                }
                c = 0;
                System.out.println(result);
            }
        });
        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int v = Integer.parseInt(value.getText().toString());
                value.setText("");
                operation.push('*');

                if(c == 1)
                {
                    result  = result + v;
                }
                else
                {
                    result = result * v;

                }
                c = 0;
                System.out.println(result);
            }
        });
        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int v = Integer.parseInt(value.getText().toString());
                value.setText("");
                operation.push('/');

                if(c == 1)
                {
                    result  = result + v;
                }
                else
                {
                    result = result / v;

                }
                c = 0;
                System.out.println(result);
            }
        });


        Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (operation.pop())
                {
                    case '+':
                        int v = Integer.parseInt(value.getText().toString());
                        result = result + v;
                        value.setText(Integer.toString(result));
                        result = 0;
                        operation.clear();
                        break;
                    case '-':
                        v = Integer.parseInt(value.getText().toString());
                        result = result - v;
                        value.setText(Integer.toString(result));
                        result = 0;
                        operation.clear();
                        c = 1;
                        break;

                    case '*':
                        v = Integer.parseInt(value.getText().toString());
                        result = result * v;
                        value.setText(Integer.toString(result));
                        result = 0;
                        operation.clear();
                        c = 1;
                        break;

                    case '/':
                        v = Integer.parseInt(value.getText().toString());
                        result =  result / v;
                        value.setText(Integer.toString(result));
                        result = 0;
                        operation.clear();
                        c = 1;
                        break;

                    case '%':
                        v = Integer.parseInt(value.getText().toString());
                        result = result % v;
                        value.setText(Integer.toString(result));
                        result = 0;
                        operation.clear();
                        break;


                }
            }
        });

        Ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value.setText("");
            }
        });




    }
}