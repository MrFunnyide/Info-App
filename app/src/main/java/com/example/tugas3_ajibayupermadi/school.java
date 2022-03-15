package com.example.tugas3_ajibayupermadi;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.tugas3_ajibayupermadi.School.AlfurqonSchool;
import com.example.tugas3_ajibayupermadi.School.UIN;
import com.example.tugas3_ajibayupermadi.School.sdPekan188;

public class school extends ListActivity {
    protected void onCreate (Bundle icile)
    {
        super.onCreate(icile);
        String[] ListMarket = new String[] {
                "Sekolah Dasar Negeri 188 PekanBaru",
                "Al Furqon Islamic School",
                "UIN Suska Riau",
                "Exit"
        };
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ListMarket));
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
            if (pilihan.equals("Sekolah Dasar Negeri 188 PekanBaru")) {
                a= new Intent(this, sdPekan188.class);
            } else if (pilihan.equals("Al Furqon Islamic School")) {
                a= new Intent(this, AlfurqonSchool.class);
            } else if (pilihan.equals("UIN Suska Riau")) {
                a= new Intent(this, UIN.class);
            } else if (pilihan.equals("Exit")) {
                System.exit(0);
            }
            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
