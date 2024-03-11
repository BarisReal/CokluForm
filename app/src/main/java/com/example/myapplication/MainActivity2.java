package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    private Bundle savedInstanceState;
    private @NonNull ActivityMain2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.savedInstanceState = savedInstanceState;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        binding =	ActivityMain2Binding.inflate(getLayoutInflater());
        View	view	=	binding.getRoot();
        setContentView(view);
        Intent	intent	=	getIntent();
        String	bilgiAdiSoyadi	=	intent.getStringExtra("adiSoyadiKey");
        String	bilgiTelefonNo	=	intent.getStringExtra("telefonNoKey");
        binding.textView2.setText(bilgiAdiSoyadi);
        binding.textView3.setText(bilgiTelefonNo);
    }
    }
