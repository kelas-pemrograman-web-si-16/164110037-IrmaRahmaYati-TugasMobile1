package com.example.tugasbiodata;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView Image;
    TextView txtnama;
    TextView txtnpm;
    TextView txtttl;
    TextView txtalamat;
    TextView txthobi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView Image = (ImageView) findViewById(R.id.Image);

        txtnama = (TextView) findViewById(R.id.txtnama);
        txtnama.setText("Nama: Irma Rahma Yati");

        txtnpm = (TextView) findViewById(R.id.txtnpm);
        txtnpm.setText("NPM: 16411037");

        txtttl = (TextView) findViewById(R.id.txtttl);
        txtttl.setText("TTL: Bandar Lampung, 01 Oktober 1997");

        txtalamat = (TextView) findViewById(R.id.txtalamat);
        txtalamat.setText("Alamat: Jl. Panglima Polim Gg. Randu 3 ujung");

        txthobi = (TextView) findViewById(R.id.txthobi);
        txthobi.setText("Hobi: Makan mie, Berenang, Jalan-jalan, Keliling-keliling");
    }
}
