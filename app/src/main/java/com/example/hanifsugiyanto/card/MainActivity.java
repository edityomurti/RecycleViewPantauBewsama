package com.example.hanifsugiyanto.card;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_daftar, btn_masuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_daftar = (Button) findViewById(R.id.btn_daftar);
        btn_masuk = (Button) findViewById(R.id.btn_masuk);

        btn_daftar.setOnClickListener(this);
        btn_masuk.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_daftar:
                startActivity(new Intent(this, Daftar.class));
                break;
            case R.id.btn_masuk:
                startActivity(new Intent(this, Masuk.class));
                break;
        }
    }
}
