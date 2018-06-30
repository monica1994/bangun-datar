package com.example.monicaputri.bangundatar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MateriActivity extends AppCompatActivity {

    @BindView(R.id.img_persegi)
    ImageView imgPersegi;
    @BindView(R.id.img_persegi_panjang)
    ImageView imgPersegiPanjang;
    @BindView(R.id.img_segitiga)
    ImageView imgSegitiga;
    @BindView(R.id.img_belah_ketupat)
    ImageView imgBelahKetupat;
    @BindView(R.id.img_jajar_genjang)
    ImageView imgJajarGenjang;
    @BindView(R.id.img_trapesium)
    ImageView imgTrapesium;
    @BindView(R.id.img_layang_layang)
    ImageView imgLayangLayang;
    @BindView(R.id.img_lingkaran)
    ImageView imgLingkaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.img_persegi, R.id.img_persegi_panjang, R.id.img_segitiga, R.id.img_belah_ketupat, R.id.img_jajar_genjang, R.id.img_trapesium, R.id.img_layang_layang, R.id.img_lingkaran})
    public void onViewClicked(View view) {

        Intent intent = new Intent(getApplicationContext(), KontenMateriActivity.class);

        switch (view.getId()) {
            case R.id.img_persegi:
                intent.putExtra("index",0);
                startActivity(intent);
                break;
            case R.id.img_persegi_panjang:
                intent.putExtra("index",1);
                startActivity(intent);
                break;
            case R.id.img_segitiga:
                intent.putExtra("index",2);
                startActivity(intent);
                break;
            case R.id.img_belah_ketupat:
                intent.putExtra("index",3);
                startActivity(intent);
                break;
            case R.id.img_jajar_genjang:
                intent.putExtra("index",4);
                startActivity(intent);
                break;
            case R.id.img_trapesium:
                intent.putExtra("index",5);
                startActivity(intent);
                break;
            case R.id.img_layang_layang:
                intent.putExtra("index",6);
                startActivity(intent);
                break;
            case R.id.img_lingkaran:
                intent.putExtra("index",7);
                startActivity(intent);
                break;
        }
    }
}
