package com.example.hanifsugiyanto.card;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PengamatActivity extends Activity {

    private List<Kandidat> kandidats;
    private List<Info> infos;
    private RecyclerView rv1;
    private RecyclerView rv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengamat);

        rv1 = (RecyclerView) findViewById(R.id.rvInfoCard);
        rv2 = (RecyclerView) findViewById(R.id.rvContestCard);

        LinearLayoutManager layoutInfo = new LinearLayoutManager(this);
        LinearLayoutManager layoutContest = new LinearLayoutManager(this);
        rv1.setLayoutManager(layoutInfo);
        rv2.setLayoutManager(layoutContest);
        rv1.setHasFixedSize(true);
        rv2.setHasFixedSize(true);

        initializeData();
        initializeAdapter();
    }


    private void initializeData(){
        infos = new ArrayList<>();
        infos.add(new Info("Tambahakan pemilihan yang ingin anda amati, pemilihan yang ingin anda pilih akan muncul di halaman ini untuk bisa diamati secara langsung"));
        infos.add(new Info("ini info kedua"));
        infos.add(new Info("ini info ketiga"));

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

    }

    private void initializeAdapter(){
        InfoCardAdapter adapterInfo = new InfoCardAdapter(infos);
        ContestCardAdapter adapterKandidat = new ContestCardAdapter(kandidats);
        rv1.setAdapter(adapterInfo);
        rv2.setAdapter(adapterKandidat);
    }

}
