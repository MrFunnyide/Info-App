package com.example.tugas3_ajibayupermadi;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.tugas3_ajibayupermadi.Market.LWPK;
import com.example.tugas3_ajibayupermadi.Market.mallSKA;
import com.example.tugas3_ajibayupermadi.Market.matahari;

public class market extends ListActivity {
    protected void onCreate (Bundle icile)
    {
        super.onCreate(icile);
        String[] ListMarket = new String[] {
                "Matahari",
                "Mall SKA",
                "Living World PekanBaru",
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
            if (pilihan.equals("Matahari")) {
                a= new Intent(this, matahari.class);
            } else if (pilihan.equals("Mall SKA")) {
                a= new Intent(this, mallSKA.class);
            } else if (pilihan.equals("Living World PekanBaru")) {
                a= new Intent(this, LWPK.class);
            } else if (pilihan.equals("Exit")) {
                System.exit(0);
            }
            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
