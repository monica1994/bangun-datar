package com.example.monicaputri.bangundatar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.monicaputri.bangundatar.materi.MateriLibrary;

import butterknife.BindView;
import butterknife.ButterKnife;

public class KontenMateriActivity extends AppCompatActivity {

    @BindView(R.id.img_bangun_datar)
    ImageView imgBangunDatar;
    @BindView(R.id.txt_penjelasan_sifat)
    TextView txtPenjelasanSifat;
    @BindView(R.id.img_rumus)
    ImageView imgRumus;
    MateriLibrary materiLibrary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konten_materi);
        ButterKnife.bind(this);
        materiLibrary = new MateriLibrary();
        String index = getIntent().getStringExtra("index");
        imgBangunDatar.setImageResource(
                materiLibrary.getImageBangunDatar(Integer.parseInt(index)));
        txtPenjelasanSifat.setText(
                materiLibrary.getSifat(Integer.parseInt(index)));
        imgRumus.setImageResource(
                materiLibrary.getFormula(Integer.parseInt(index)));
    }


}
