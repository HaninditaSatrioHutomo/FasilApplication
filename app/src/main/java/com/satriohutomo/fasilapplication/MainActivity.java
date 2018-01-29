package com.satriohutomo.fasilapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nama;
    EditText password;
    Button login;
    Button Calcu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama=(EditText) findViewById(R.id.et1);
        password=(EditText) findViewById(R.id.et2);
        login=(Button)findViewById(R.id.btn_login);
        Calcu = (Button) findViewById(R.id.btn_calcu);

        login.setOnClickListener(Loginclicked);
        Calcu.setOnClickListener(CalcuClicked);
    }
    View.OnClickListener Loginclicked=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            falidasi();
        }
    };
    View.OnClickListener CalcuClicked=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            gotocalcu();
        }
    };
    private void falidasi(){
        String ambilnama=nama.getText().toString();
        String ambilpassword=password.getText().toString();

        if (ambilnama.equals("hanindita")&&ambilpassword.equals("1234")){
            gotopilih();
        }else {
            Toast.makeText(this,"Login Gagal",Toast.LENGTH_SHORT).show();
        }
    }
    private void gotopilih(){
        Intent intenttopilih=new Intent(this,PilihActivity.class);
        startActivity(intenttopilih);
    }
    private void gotocalcu(){
        Intent intenttocalcu=new Intent(this, CalcuActivity.class);
        startActivity(intenttocalcu);
    }
}
