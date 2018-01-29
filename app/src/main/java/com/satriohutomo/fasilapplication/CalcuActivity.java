package com.satriohutomo.fasilapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by aura comp on 1/29/2018.
 */

public class CalcuActivity extends Activity {

    EditText angkapertama;
    EditText angkakedua;
    Button btnhitung;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.calcu_activity);

        angkapertama=(EditText) findViewById(R.id.inputangka1);
        angkakedua=(EditText) findViewById(R.id.inputangka2);
        btnhitung=(Button) findViewById(R.id.buttonhitung);

        btnhitung.setOnClickListener(hitungclicked);
    }
    View.OnClickListener hitungclicked=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            hitung();
        }
    };
    public void hitung(){
        int angka1=Integer.parseInt(angkapertama.getText().toString());
        int angka2=Integer.parseInt(angkakedua.getText().toString());
        int hitungangka=angka1+angka2;
        String nilaistring=String.valueOf(hitungangka);
        gotohasil(nilaistring);
    }
    private void gotohasil(String kirimangka){
        Intent intenttohasil=new Intent(this, HasilActivity.class);
        intenttohasil.putExtra("key_angka",kirimangka);
        startActivity(intenttohasil);
    }
}
