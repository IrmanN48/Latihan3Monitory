package com.example.latihan3monitory;
/*
 * NIM   : 10118018
 * NAMA  : Irman Novryansah
 * KELAS : IF1
 * TGL   : 08/05/2021
 * Deskripsi : Membuat Tampilan HomeActivity dan Menampung nilai dari BiodataActivity
 * */

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //get data intent
        Intent intent = getIntent();
        String pesan = intent.getStringExtra(BiodataActivity.EXTRA_MESSAGE);

        //set text
        TextView teks2 = findViewById(R.id.txt_home2);
        teks2.setText(pesan);
        TextView teks6 = findViewById(R.id.txt_home5);
        teks6.setText(pesan);
    }
}