package com.example.exercise1_20160140034_b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);


        TextView tvnama,tvnomor;
        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("a");

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);

        switch (nama)
        {
            case "Egi":
                tvnama.setText("Ilham Egi");
                tvnomor.setText("098975675543");
                break;
            case "Hakim":
                tvnama.setText("Musthofa Hakim");
                tvnomor.setText("082644678454");
                break;
            case "Yudis":
                tvnama.setText("Yudistira Ari");
                tvnomor.setText("087653254789");
                break;
            case "Auli":
                tvnama.setText("Aulia N");
                tvnomor.setText("0864345678765");
                break;
            case "Audi":
                tvnama.setText("Auditya");
                tvnomor.setText("086535678986");
                break;
            case "Erik":
                tvnama.setText("Erik R");
                tvnomor.setText("084567898644");
                break;
            case "Octa":
                tvnama.setText("Octavianus");
                tvnomor.setText("089875435678");
                break;
            case "Biyan":
                tvnama.setText("Sabil Biyan");
                tvnomor.setText("089765434567");
                break;
            case "Ilham":
                tvnama.setText("Ilham Effendi");
                tvnomor.setText("085776588865");
                break;

        }
    }
}