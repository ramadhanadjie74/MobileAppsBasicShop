package com.example.warung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnBayar;
    private TextView nominal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBayar = findViewById(R.id.btnBayar);
        nominal = findViewById(R.id.nominal);

        btnBayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            tampilTotal();
            }
        });
    }

    private void tampilTotal() {
        double total  = 20000+25000+15000+10000+5000+15000+12000+8000;
        String hasil = "Total Harga yaitu " + total;
        nominal.setText(hasil);

    }
}