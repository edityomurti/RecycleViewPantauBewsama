package com.example.hanifsugiyanto.card;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends Activity {

    private List<Kandidat> kandidats;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.recycle_card);

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