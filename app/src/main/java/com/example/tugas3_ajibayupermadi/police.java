package com.example.tugas3_ajibayupermadi;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.tugas3_ajibayupermadi.Police.PoldaRiau;
import com.example.tugas3_ajibayupermadi.Police.PolrestaPekan;
import com.example.tugas3_ajibayupermadi.Police.PolsekPekanBaru;
import com.example.tugas3_ajibayupermadi.Police.PolsekTampan;

public class police extends ListActivity {
    protected void onCreate (Bundle icile)
    {
        super.onCreate(icile);
        String[] ListPolice = new String[] {
                "Polsek Pekan Baru Kota",
                "Polsek Tampan",
                "Polresta Pekanbaru",
                "Polda Riau",
                "Exit"
        };
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ListPolice));
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
            if (pilihan.equals("Polsek Pekan Baru Kota")) {
                a = new Intent(this, PolsekPekanBaru.class);
            } else if (pilihan.equals("Polsek Tampan")) {
                a = new Intent(this, PolsekTampan.class);
            } else if (pilihan.equals("Polresta Pekanbaru")) {
                a = new Intent(this, PolrestaPekan.class);
            } else if (pilihan.equals("Polda Riau")) {
                a = new Intent(this, PoldaRiau.class);
            } else if (pilihan.equals("Exit")) {
                System.exit(0);
            }
            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
