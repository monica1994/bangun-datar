package com.example.monicaputri.bangundatar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.img_materi)
    ImageView imgMateri;
    @BindView(R.id.img_latihan)
    ImageView imgLatihan;
    @BindView(R.id.img_ujian)
    ImageView imgUjian;
    @BindView(R.id.img_peringkat)
    ImageView imgPeringkat;
    @BindView(R.id.img_kredit)
    ImageView imgKredit;
    @BindView(R.id.img_keluar)
    ImageView imgKeluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.img_materi, R.id.img_latihan, R.id.img_ujian, R.id.img_peringkat, R.id.img_kredit, R.id.img_keluar})
    public void onViewClicked(View view) {

        Intent intent = null;

        switch (view.getId()) {
            case R.id.img_materi:
                intent = new Intent(getApplicationContext(), MateriActivity.class);
                startActivity(intent);
                break;
            case R.id.img_latihan:
                intent = new Intent(getApplicationContext(), LatihanActivity.class);
                startActivity(intent);
                break;
            case R.id.img_ujian:
                intent = new Intent(getApplicationContext(), UjianActivity.class);
                startActivity(intent);
                break;
            case R.id.img_peringkat:
                intent = new Intent(getApplicationContext(), PeringkatActivity.class);
                startActivity(intent);
                break;
            case R.id.img_kredit:
                intent = new Intent(getApplicationContext(), CreditActivity.class);
                startActivity(intent);
                break;
            case R.id.img_keluar:
                break;
        }
    }
}
