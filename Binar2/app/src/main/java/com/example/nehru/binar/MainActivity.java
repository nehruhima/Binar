package com.example.nehru.binar;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.nehru.binar.tblemodel.Toko;

public class MainActivity extends AppCompatActivity {

    Toko toko;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.action_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.insert:

                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.insert_layout);
                dialog.setCanceledOnTouchOutside(true);
                dialog.setTitle("Submit");

                final EditText nama_barang = (EditText) dialog.findViewById(R.id.txtNamaBrg);
                final EditText jumlah_barang = (EditText)dialog.findViewById(R.id.txtjmlbrg);
                final EditText pemsok = (EditText)dialog.findViewById(R.id.txtPemasok);
                final EditText tanngal = (EditText)dialog.findViewById(R.id.txtDate);
                Button insert = (Button) dialog.findViewById(R.id.btnSubmit);

                insert.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        toko = new Toko();
                        String nBrg = nama_barang.getText().toString().trim();
                        String jmlbrg = jumlah_barang.getText().toString().trim();
                        String nmaPemasok = pemsok.getText().toString().trim();
                        String tgal = tanngal.getText().toString().trim();
                        toko.setNmabrg(nBrg);
                        toko.setJmlBrg(jmlbrg);
                        toko.setPmsok(nmaPemasok);
                        toko.setTanggal(tgal);

                        toko.save();
                        Toast.makeText(MainActivity.this, "Insert Data Successfull", Toast.LENGTH_SHORT).show();
                        dialog.hide();
                    }
                });
                dialog.show();

                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
