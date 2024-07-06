package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.login.R;

public class MenuActivity extends AppCompatActivity {
    private Button _tampilMahasiswaButton, _tampilForexButton, _tampilCuacaButton;
    private Intent _tampilMahasiswaIntent, _tampilForexIntent, _tampilCuacaIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        
        initTampilMahasiswaButton();
        initTampilForexButton();
        initTampilCuacaButton();
    }

    private void initTampilCuacaButton() {
        _tampilCuacaButton = (Button) findViewById(R.id.tampilCuacaButton);
        _tampilCuacaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _tampilCuacaIntent = new Intent(getApplicationContext(), CuacaMainActivity.class);
                startActivity(_tampilCuacaIntent);
            }
        });
    }

    private void initTampilForexButton() {
        _tampilForexButton = (Button) findViewById(R.id.tampilForexButton);
        _tampilForexButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _tampilForexIntent = new Intent(getApplicationContext(), ForexActivity.class);
                startActivity(_tampilForexIntent);
            }
        });
    }

    private void initTampilMahasiswaButton() {
        _tampilMahasiswaButton = (Button) findViewById(R.id.tampilMahasiswaButton);
        _tampilMahasiswaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _tampilMahasiswaIntent = new Intent(getApplicationContext(), TampilMahasiswaActivity.class);
                startActivity(_tampilMahasiswaIntent);
            }
        });
    }
}