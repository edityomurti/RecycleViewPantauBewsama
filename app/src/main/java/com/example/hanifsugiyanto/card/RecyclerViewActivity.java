package com.example.hanifsugiyanto.card;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends Activity {

    private List<Kandidat> kandidats;
    private RecyclerView rv;

    //untuk spinner
    Spinner spinner1, spinner2, spinner3, spinner4, spinner5;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.recycle_card);

        //inisialisasi spinner
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        adapter = ArrayAdapter.createFromResource(this,R.array.nama_provinsi,R.layout.custom_spinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + "selected", Toast.LENGTH_LONG).show();
                //((TextView) parent.getChildAt(0)).setTextColor(Color.BLUE);
                ((TextView) parent.getChildAt(0)).setTextSize(13);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        adapter = ArrayAdapter.createFromResource(this,R.array.jabatan,R.layout.custom_spinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+"selected", Toast.LENGTH_LONG).show();
                ((TextView) parent.getChildAt(0)).setTextSize(13);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }


        });
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        adapter = ArrayAdapter.createFromResource(this,R.array.kabupaten,R.layout.custom_spinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+"selected", Toast.LENGTH_LONG).show();
                ((TextView) parent.getChildAt(0)).setTextSize(13);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }


        });
        spinner4 = (Spinner) findViewById(R.id.spinner4);
        adapter = ArrayAdapter.createFromResource(this,R.array.kecamatan,R.layout.custom_spinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter);
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+"selected", Toast.LENGTH_LONG).show();
                ((TextView) parent.getChildAt(0)).setTextSize(13);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }


        });
        spinner5 = (Spinner) findViewById(R.id.spinner5);
        adapter = ArrayAdapter.createFromResource(this,R.array.kelurahan,R.layout.custom_spinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adapter);
        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+"selected", Toast.LENGTH_LONG).show();
                ((TextView) parent.getChildAt(0)).setTextSize(13);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }


        });

        rv=(RecyclerView)findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);

        initializeData();
        initializeAdapter();
    }

    private void initializeData(){
        kandidats = new ArrayList<>();
        kandidats.add(new Kandidat(
                "Bupati", "Sleman", "(Provinsi) DIY",
                R.drawable.user, R.drawable.user, "Emma Wilson1", "Emma Wilson1",
                R.drawable.user, R.drawable.user, "Emma Wilson1", "Emma Wilson1",
                R.drawable.user, R.drawable.user, "Emma Wilson", "Emma Wilson",
                R.drawable.user, R.drawable.user, "Emma Wilson", "Emma Wilson",
                "2000 (49%)", "300 (13% TPS)", "9 (2% TPS)"));
        kandidats.add(new Kandidat(
                "Bupati", "Sleman", "(Provinsi) DIY",
                R.drawable.user, R.drawable.user, "Emma Wilson1", "Emma Wilson1",
                R.drawable.user, R.drawable.user, "Emma Wilson1", "Emma Wilson1",
                R.drawable.user, R.drawable.user, "Emma Wilson", "Emma Wilson",
                R.drawable.user, R.drawable.user, "Emma Wilson", "Emma Wilson",
                "2000 (49%)", "300 (13% TPS)", "9 (2% TPS)"));
        kandidats.add(new Kandidat(
                "Bupati", "Sleman", "(Provinsi) DIY",
                R.drawable.user, R.drawable.user, "Emma Wilson1", "Emma Wilson1",
                R.drawable.user, R.drawable.user, "Emma Wilson1", "Emma Wilson1",
                R.drawable.user, R.drawable.user, "Emma Wilson", "Emma Wilson",
                R.drawable.user, R.drawable.user, "Emma Wilson", "Emma Wilson",
                "2000 (49%)", "300 (13% TPS)", "9 (2% TPS)"));
        kandidats.add(new Kandidat(
                "Bupati", "Sleman", "(Provinsi) DIY",
                R.drawable.user, R.drawable.user, "Emma Wilson1", "Emma Wilson1",
                R.drawable.user, R.drawable.user, "Emma Wilson1", "Emma Wilson1",
                R.drawable.user, R.drawable.user, "Emma Wilson", "Emma Wilson",
                R.drawable.user, R.drawable.user, "Emma Wilson", "Emma Wilson",
                "2000 (49%)", "300 (13% TPS)", "9 (2% TPS)"));
        kandidats.add(new Kandidat(
                "Bupati", "Sleman", "(Provinsi) DIY",
                R.drawable.user, R.drawable.user, "Emma Wilson1", "Emma Wilson1",
                R.drawable.user, R.drawable.user, "Emma Wilson1", "Emma Wilson1",
                R.drawable.user, R.drawable.user, "Emma Wilson", "Emma Wilson",
                R.drawable.user, R.drawable.user, "Emma Wilson", "Emma Wilson",
                "2000 (49%)", "300 (13% TPS)", "9 (2% TPS)"));
        kandidats.add(new Kandidat(
                "Bupati", "Sleman", "(Provinsi) DIY",
                R.drawable.user, R.drawable.user, "Emma Wilson1", "Emma Wilson1",
                R.drawable.user, R.drawable.user, "Emma Wilson1", "Emma Wilson1",
                R.drawable.user, R.drawable.user, "Emma Wilson", "Emma Wilson",
                R.drawable.user, R.drawable.user, "Emma Wilson", "Emma Wilson",
                "2000 (49%)", "300 (13% TPS)", "9 (2% TPS)"));
        kandidats.add(new Kandidat(
                "Bupati", "Sleman", "(Provinsi) DIY",
                R.drawable.user, R.drawable.user, "Emma Wilson1", "Emma Wilson1",
                R.drawable.user, R.drawable.user, "Emma Wilson1", "Emma Wilson1",
                R.drawable.user, R.drawable.user, "Emma Wilson", "Emma Wilson",
                R.drawable.user, R.drawable.user, "Emma Wilson", "Emma Wilson",
                "2000 (49%)", "300 (13% TPS)", "9 (2% TPS)"));
        kandidats.add(new Kandidat(
                "Bupati", "Sleman", "(Provinsi) DIY",
                R.drawable.user, R.drawable.user, "Emma Wilson1", "Emma Wilson1",
                R.drawable.user, R.drawable.user, "Emma Wilson1", "Emma Wilson1",
                R.drawable.user, R.drawable.user, "Emma Wilson", "Emma Wilson",
                R.drawable.user, R.drawable.user, "Emma Wilson", "Emma Wilson",
                "2000 (49%)", "300 (13% TPS)", "9 (2% TPS)"));
        kandidats.add(new Kandidat(
                "Bupati", "Sleman", "(Provinsi) DIY",
                R.drawable.user, R.drawable.user, "Emma Wilson1", "Emma Wilson1",
                R.drawable.user, R.drawable.user, "Emma Wilson1", "Emma Wilson1",
                R.drawable.user, R.drawable.user, "Emma Wilson", "Emma Wilson",
                R.drawable.user, R.drawable.user, "Emma Wilson", "Emma Wilson",
                "2000 (49%)", "300 (13% TPS)", "9 (2% TPS)"));
    }

    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(kandidats);
        rv.setAdapter(adapter);
    }
}