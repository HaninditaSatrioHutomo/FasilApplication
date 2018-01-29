package com.satriohutomo.fasilapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by aura comp on 1/29/2018.
 */

public class HasilActivity extends Activity {

    TextView hasilhitung;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.hasil_activity);

        hasilhitung=(TextView) findViewById(R.id.hasil);

        Intent intentdata = getIntent();
        String hasil = intentdata.getExtras().getString("key_angka");

        hasilhitung.setText(hasil);
    }
}
