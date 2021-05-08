package com.example.latihan3monitory;

/*
 * NIM   : 10118018
 * NAMA  : Irman Novryansah
 * KELAS : IF1
 * TGL   : 08/05/2021
 * Deskripsi : Membuat Tampilan BiodataActivity, mengirim nilai dari txt_nama dan membuat onClick menuju HomeActivity
 * */

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class BiodataActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.latihan3monitory.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void btn_selanjutnya(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        EditText nama = findViewById(R.id.txt_nama);
        String message = nama.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }
}