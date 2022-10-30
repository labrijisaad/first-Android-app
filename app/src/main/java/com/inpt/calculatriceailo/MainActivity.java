package com.inpt.calculatriceailo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnadd, btnsubs, btnmult, btndiv;
    EditText field1, field2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnadd = findViewById(R.id.sum);
        btnsubs = findViewById(R.id.sub);
        btndiv = findViewById(R.id.div);
        btnmult = findViewById(R.id.mul);

        field1 = findViewById(R.id.field1);
        field2 = findViewById(R.id.field2);
        result = findViewById(R.id.result);


        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (field1.getText().toString().equals("")) {
                    // Showing Toast (Message)
                    Toast.makeText(MainActivity.this, "Saisir un nombre", Toast.LENGTH_SHORT).show();
                } else if (field2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Saisir un nombre", Toast.LENGTH_SHORT).show();
                } else {
                    float a, b, c;
                    a = Float.parseFloat(field1.getText().toString());
                    b = Float.parseFloat(field2.getText().toString());
                    c = a + b;
                    result.setText("Le resultat de la somme est " + c);

                }

            }
        });
        btnsubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (field1.getText().toString().equals("")) {
                    // Showing Toast (Message)
                    Toast.makeText(MainActivity.this, "Saisir un nombre", Toast.LENGTH_SHORT).show();
                } else if (field2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Saisir un nombre", Toast.LENGTH_SHORT).show();
                } else {
                    float a, b, c;
                    a = Float.parseFloat(field1.getText().toString());
                    b = Float.parseFloat(field2.getText().toString());
                    c = a - b;
                    result.setText("Le resultat de la soustraction est " + c);

                }
            }
        });
        btnmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (field1.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Saisir un nombre", Toast.LENGTH_SHORT).show();
                } else if (field2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Saisir un nombre", Toast.LENGTH_SHORT).show();
                } else {
                    float a, b, c;
                    a = Float.parseFloat(field1.getText().toString());
                    b = Float.parseFloat(field2.getText().toString());
                    c = a * b;
                    result.setText("Le resultat de la multiplication est " + c);

                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (field1.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Saisir un nombre", Toast.LENGTH_SHORT).show();
                } else if (field2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Saisir un nombre", Toast.LENGTH_SHORT).show();
                } else {
                    float a, b, c;

                    a = Float.parseFloat(field1.getText().toString());
                    b = Float.parseFloat(field2.getText().toString());
                    c = a / b;
                    result.setText("Le resultat de la division est " + c);

                }
            }
        });
    }
}