package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @NonNull ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

            String adiSoyadi = binding.adiSoyadi.getText().toString();
            String telefonNo = binding.telefonNumarasi.getText().toString();

            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("adiSoyadiKey", adiSoyadi);
            intent.putExtra("telefonNoKey", telefonNo);
            startActivity(intent);
        }
    }
