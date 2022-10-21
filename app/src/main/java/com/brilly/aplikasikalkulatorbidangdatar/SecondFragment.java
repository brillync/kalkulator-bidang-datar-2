package com.brilly.aplikasikalkulatorbidangdatar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondFragment extends Fragment {
    private EditText txtalas, txtTinggi;
    private Button btnHasil;
    private TextView hasil;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_second,container, false);
        txtalas = v.findViewById(R.id.txtalas);
        txtTinggi = v.findViewById(R.id.txtTinggi);
        btnHasil = v.findViewById(R.id.btnHasil);
        hasil = v.findViewById(R.id.hasil);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai1 = txtalas.getText().toString();
                String nilai2 = txtTinggi.getText().toString();

                if (nilai1.isEmpty()) {
                    txtalas.setError("Data tidak boleh kosong");
                    txtTinggi.requestFocus();
               }else if (nilai2.isEmpty()) {
                    txtalas.setError("Data tidak boleh kosong");
                    txtTinggi.requestFocus();

                }else {
                    Double alas = Double.parseDouble(nilai1);
                    Double tinggi = Double.parseDouble(nilai2);
                    Double luas =  0.5 * alas * tinggi;
                    hasil.setText(String.format("%.2f", luas));

                }

            }
        });

        return v;
    }
}