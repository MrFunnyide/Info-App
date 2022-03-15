package com.example.tugas3_ajibayupermadi.School;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class sdPekan188 extends ListActivity {
    protected void onCreate(Bundle icile) {
        super.onCreate(icile);
        String[] ListAction = new String[]{
                "Call Center",
                "SMS Center",
                "Website",
                "Info Google",
                "Exit"
        };
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ListAction));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanPilihan(pilihan);
    }

    private void tampilkanPilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Call Center")) {
                String noHP = "tel:0761-31307";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(noHP));
            } else if (pilihan.equals("SMS Center")) {
                String textSMS = "Aji Bayu Permadi H/L";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:0761-31307"));
                a.putExtra("sms_body", textSMS);
            } else if (pilihan.equals("Website")) {
                String webAB = "https://sekolah.data.kemdikbud.go.id/index.php/chome/profil/BC416624-FE76-4ADC-B715-247E8147509D";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(webAB));
            } else if (pilihan.equals("Info Google")) {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY, "Sekolah Dasar Negeri 188 PekanBaru");
            } else if (pilihan.equals("Exit")) {
                System.exit(0);
            }
            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
