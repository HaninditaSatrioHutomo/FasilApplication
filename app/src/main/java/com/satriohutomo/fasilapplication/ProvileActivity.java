package com.satriohutomo.fasilapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by aura comp on 1/28/2018.
 */

public class ProvileActivity extends Activity {

    ImageView gambar;
    TextView nama;
    TextView alamat;
    TextView email;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profil_activity);

        gambar=(ImageView)findViewById(R.id.image_provile);
        nama=(TextView)findViewById(R.id.text_nama);
        alamat=(TextView)findViewById(R.id.text_alamat);
        email=(TextView)findViewById(R.id.text_email);

        Intent intentdata=getIntent();
        String ambilnama=intentdata.getExtras().getString("key_nama");
        String ambilalamat=intentdata.getExtras().getString("key_alamat");
        String ambilemail=intentdata.getExtras().getString("key_email");
        int ambilgambar=intentdata.getExtras().getInt("key_image");

        nama.setText(ambilnama);
        alamat.setText(ambilalamat);
        email.setText(ambilemail);
        gambar.setImageDrawable(getResources().getDrawable(ambilgambar));
    }
}
