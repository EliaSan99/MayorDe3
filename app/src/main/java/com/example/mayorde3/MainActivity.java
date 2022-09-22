package com.example.mayorde3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    EditText txfN1,txfN2, txfN3;
    TextView tv1;
    Button btnMyr;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txfN1 = findViewById(R.id.txfN1);
        txfN2 = findViewById(R.id.txfN2);
        txfN3 = findViewById(R.id.txfN3);
        tv1   = findViewById(R.id.lblResultado);
        btnMyr = findViewById(R.id.btnMayor);
    }



    @Override
    public void onClick(View view)
    {
        String n1 = txfN1.getText().toString();
        String n2 = txfN2.getText().toString();
        String n3 = txfN3.getText().toString();

        int k1 = Integer.parseInt(n1);
        int k2 = Integer.parseInt(n2);
        int k3 = Integer.parseInt(n3);

        if(k1 > k2 && k1 > k3)
        {
            tv1.setText(String.valueOf(n1));
        }else if (k2 > k1 && k2 > k3)
        {
            tv1.setText(String.valueOf(n2));
        }else
            tv1.setText(String.valueOf(n3));
    }
}