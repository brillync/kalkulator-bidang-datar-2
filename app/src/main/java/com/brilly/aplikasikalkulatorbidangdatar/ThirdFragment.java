package com.brilly.aplikasikalkulatorbidangdatar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdFragment extends Fragment {
    private Button btnHasil;
    private EditText txtjari_jari;
    private TextView hasil;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_third,container,false);
        btnHasil = v.findViewById(R.id.btnHasil);
        txtjari_jari = v.findViewById(R.id.txtjari_jari);
        hasil = v.findViewById(R.id.hasil);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai = txtjari_jari.getText().toString();

                if (nilai.isEmpty()) {
                    txtjari_jari.setError("Jari - jari tidak boleh kosong");
                    txtjari_jari.requestFocus();
                }else {
                    Double jari = Double.parseDouble(nilai);
                    Double keliling = 2 * 3.14 *jari;
                    Double luas =  3.14 * jari * jari;
                    hasil.setText(String.format("%.2f", luas));

                }

            }
        });

        return v;
    }
}