package com.brilly.aplikasikalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fragmentFirst(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new FirstFragment()).commit();
    }

    public void fragmentSecond(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new SecondFragment()).commit();
    }

    public void fragmentThird(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new ThirdFragment()).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new SecondFragment()).commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new ThirdFragment()).commit();
    }
}