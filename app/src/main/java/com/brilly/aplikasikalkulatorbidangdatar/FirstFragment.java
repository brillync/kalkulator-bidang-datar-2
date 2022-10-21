package com.brilly.aplikasikalkulatorbidangdatar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class FirstFragment extends Fragment {
    private Button btnHasil;
    private EditText txtpanjang, txtlebar;
    private TextView hasil;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_first, container, false);
        btnHasil = v.findViewById(R.id.btnHasil);
        txtpanjang = v.findViewById(R.id.txtpanjang);
        txtlebar = v.findViewById(R.id.txtlebar);
        hasil = v.findViewById(R.id.hasil);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai1 = txtpanjang.getText().toString();
                String nilai2 = txtlebar.getText().toString();

                if (nilai1.isEmpty()) {
                    txtpanjang.setError("Data tidak boleh kosong");
                    txtpanjang.requestFocus();
                }else if (nilai2.isEmpty()) {
                    txtlebar.setError("Data tidak boleh kosong");
                    txtlebar.requestFocus();

                }else {
                    Integer panjang = Integer.parseInt(nilai1);
                    Integer lebar = Integer.parseInt(nilai2);
                    Integer luas =  panjang*lebar;
                    hasil.setText(String.valueOf(luas));

                }

            }
        });

        return v;
    }
}