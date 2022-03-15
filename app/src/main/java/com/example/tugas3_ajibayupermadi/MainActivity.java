package com.example.tugas3_ajibayupermadi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    // action when click hospital picture
    public void clickHospital(View view) {
        Intent i = new Intent(this,hospital.class);
        startActivity(i);
    }

    // action when click police picture
    public void clickPolice(View view) {
        Intent i = new Intent(this,police.class);
        startActivity(i);
    }

    // action when click market picture
    public void clickMarket(View view) {
        Intent i = new Intent(this,market.class);
        startActivity(i);
    }

    // action when click school picture
    public void clickSchool(View view) {
        Intent i = new Intent(this,school.class);
        startActivity(i);
    }
}