package com.example.tugas3_ajibayupermadi;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.tugas3_ajibayupermadi.Hospital.EkaHospital;
import com.example.tugas3_ajibayupermadi.Hospital.RSAwalBros;
import com.example.tugas3_ajibayupermadi.Hospital.RSTabrani;
import com.example.tugas3_ajibayupermadi.Hospital.RSTampan;


public class hospital extends ListActivity {
    protected void onCreate (Bundle icile)
    {
        super.onCreate(icile);
        String[] ListHospital = new String[] {
                "Rumah Sakit Awal Bros",
                "Rumah Sakit Eka Hospital",
                "Rumah Sakit Jiwa Tampan",
                "Rs Tabrani",
                "Exit"
        };
        this.setListAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, ListHospital));
    }

    protected void onListItemClick (ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o  = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanPilihan(pilihan);
    }

    private void tampilkanPilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Rumah Sakit Awal Bros")) {
                a= new Intent(this, RSAwalBros.class);
            } else if (pilihan.equals("Rumah Sakit Eka Hospital")) {
                a= new Intent(this, EkaHospital.class);
            } else if (pilihan.equals("Rumah Sakit Jiwa Tampan")) {
                a= new Intent(this, RSTampan.class);
            } else if (pilihan.equals("Rs Tabrani")) {
                a= new Intent(this, RSTabrani.class);
            } else if (pilihan.equals("Exit")) {
                System.exit(0);
            }
            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
