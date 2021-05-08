package com.example.latihan3monitoryapp;
/*
 * NIM   : 10118018
 * NAMA  : Irman Novryansah
 * KELAS : IF1
 * TGL   : 08/05/2021
 * Deskripsi : Membuat Tampilan MainActivity dan membuat onClick menuju LoginActivity
 * */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.latihan3monitory.LoginActivity;
import com.example.latihan3monitory.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnmulai(View view) {
        Intent intent =  new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}