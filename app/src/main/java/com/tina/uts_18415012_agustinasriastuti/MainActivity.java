package com.tina.uts_18415012_agustinasriastuti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e_nama, e_golongan;
    TextView t_nama, t_golongan, t_gaji, t_tunjangan, t_pajak, t_gaji_bersih;
    Button b_submit;
    String nama_karyawan;
    int golongan;
    double gaji, tunjangan, pajak, gaji_bersih;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e_nama = (EditText)findViewById(R.id.nama);
        e_golongan = (EditText)findViewById(R.id.golongan);

        t_nama = (TextView)findViewById(R.id.text_nama);
        t_golongan = (TextView)findViewById(R.id.text_golongan);
        t_gaji = (TextView)findViewById(R.id.text_gaji);
        t_tunjangan = (TextView)findViewById(R.id.text_tunjangan);
        t_pajak = (TextView)findViewById(R.id.text_pajak);
        t_gaji_bersih = (TextView)findViewById(R.id.text_gaji_bersih);

        b_submit = (Button)findViewById(R.id.btn_hitung);
        b_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nama_karyawan = e_nama.getText().toString();
                golongan = Integer.parseInt(e_golongan.getText().toString());

                t_nama.setText(String.valueOf(nama_karyawan));
                t_golongan.setText(String.valueOf(golongan));

                if (golongan == 1){
                    gaji = 1500000;
                    tunjangan = 1000000;
                    pajak = (gaji + tunjangan) * 0.01;
                    gaji_bersih = gaji + tunjangan - pajak;

                    t_gaji.setText(String.valueOf(gaji));
                    t_tunjangan.setText(String.valueOf(tunjangan));
                    t_pajak.setText(String.valueOf(pajak));
                    t_gaji_bersih.setText(String.valueOf(gaji_bersih));
                }else if (golongan == 2){
                    gaji = 2000000;
                    tunjangan = 1500000;
                    pajak = (gaji + tunjangan) * 0.02;
                    gaji_bersih = gaji + tunjangan - pajak;

                    t_gaji.setText(String.valueOf(gaji));
                    t_tunjangan.setText(String.valueOf(tunjangan));
                    t_pajak.setText(String.valueOf(pajak));
                    t_gaji_bersih.setText(String.valueOf(gaji_bersih));
                }else if(golongan == 3){
                    gaji = 2500000;
                    tunjangan = 2000000;
                    pajak = (gaji + tunjangan) * 0.03;
                    gaji_bersih = gaji + tunjangan - pajak;

                    t_gaji.setText(String.valueOf(gaji));
                    t_tunjangan.setText(String.valueOf(tunjangan));
                    t_pajak.setText(String.valueOf(pajak));
                    t_gaji_bersih.setText(String.valueOf(gaji_bersih));
                }else if (golongan == 4){
                    gaji = 3000000;
                    tunjangan = 2500000;
                    pajak = (gaji + tunjangan) * 0.04;
                    gaji_bersih = gaji + tunjangan - pajak;

                    t_gaji.setText(String.valueOf(gaji));
                    t_tunjangan.setText(String.valueOf(tunjangan));
                    t_pajak.setText(String.valueOf(pajak));
                    t_gaji_bersih.setText(String.valueOf(gaji_bersih));
                }

            }
        });

    }
}