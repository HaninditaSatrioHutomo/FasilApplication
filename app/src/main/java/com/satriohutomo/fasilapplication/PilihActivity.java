package com.satriohutomo.fasilapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by aura comp on 1/29/2018.
 */

public class PilihActivity extends Activity {

    ImageView Gambar1;
    ImageView Gambar2;
    ImageView Gambar3;
    ImageView Gambar4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilih_activity);

        Gambar1=(ImageView)findViewById(R.id.gambar1);
        Gambar2=(ImageView)findViewById(R.id.gambar2);
        Gambar3=(ImageView)findViewById(R.id.gambar3);
        Gambar4=(ImageView)findViewById(R.id.gambar4);

        Gambar1.setOnClickListener(gambar1clicked);
        Gambar2.setOnClickListener(gambar2clicked);
        Gambar3.setOnClickListener(gambar3clicked);
        Gambar4.setOnClickListener(gambar4clicked);

    }
    View.OnClickListener gambar1clicked= new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            gotoprovile("Amar Nuruk","amar@gmail.com","sukoharjo",R.drawable.gambar2);
        }
    };
    View.OnClickListener gambar2clicked= new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            gotoprovile("Andik Gendot","gendot@gail.com","Klaten",R.drawable.gambar4);
        }
    };
    View.OnClickListener gambar3clicked= new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            gotoprovile("Caesar Septy","septy@gmail.com","Kudus",R.drawable.gambar5);
        }
    };
    View.OnClickListener gambar4clicked= new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            gotoprovile("Haninditash","hanindita@gmail.com","Banyumas",R.drawable.gambar6);
        }
    };
    private void gotoprovile(String nama, String email, String alamat, int image){
        Intent intenttoprovile=new Intent(this,ProvileActivity.class);
        intenttoprovile.putExtra("key_nama", nama);
        intenttoprovile.putExtra("key_email", email);
        intenttoprovile.putExtra("key_alamat", alamat);
        intenttoprovile.putExtra("key_image", image);
        startActivity(intenttoprovile);
    }
}
