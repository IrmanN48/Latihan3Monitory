package com.example.latihan3monitory;
/*
 * NIM   : 10118018
 * NAMA  : Irman Novryansah
 * KELAS : IF1
 * TGL   : 08/05/2021
 * Deskripsi : Membuat Tampilan LoginActivity dan membuat onClick menuju BiodataActivity
 * */

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void btn_masuk(View view) {
        Intent intent =  new Intent(this,BiodataActivity.class);
        startActivity(intent);
    }
}