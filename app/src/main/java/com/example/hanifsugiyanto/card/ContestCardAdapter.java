package com.example.hanifsugiyanto.card;

/**
 * Created by hanifsugiyanto on 04/11/15.
 */

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ContestCardAdapter extends RecyclerView.Adapter<ContestCardAdapter.KandidatViewHolder> {

    public static class KandidatViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        /*
        TextView personName;
        TextView personAge;
        ImageView personPhoto1;
        ImageView personPhoto2;
        */
        TextView  nama_Jabatan;
        TextView  daerah_Jabatan;
        TextView  daerah_Uplevel;
        ImageView foto_Calon1;
        ImageView foto_Wakil1;
        TextView  nama_Calon1;
        TextView  nama_Wakil1;
        ImageView foto_Calon2;
        ImageView foto_Wakil2;
        TextView  nama_Calon2;
        TextView  nama_Wakil2;
        ImageView foto_Calon3;
        ImageView foto_Wakil3;
        TextView  nama_Calon3;
        TextView  nama_Wakil3;
        ImageView foto_Calon4;
        ImageView foto_Wakil4;
        TextView  nama_Calon4;
        TextView  nama_Wakil4;
        TextView  jml_pengamat;
        TextView  jml_pengawas;
        TextView  jml_saksi;


        KandidatViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.card_contest);
            nama_Jabatan = (TextView) itemView.findViewById(R.id.textNamaJabatan);
            daerah_Jabatan = (TextView) itemView.findViewById(R.id.textDaerahJabatan);
            daerah_Uplevel = (TextView) itemView.findViewById(R.id.textDaerahUplevel);

            foto_Calon1 = (ImageView) itemView.findViewById(R.id.imageFotoCalon1);
            foto_Calon2 = (ImageView) itemView.findViewById(R.id.imageFotoCalon2);
            foto_Calon3 = (ImageView) itemView.findViewById(R.id.imageFotoCalon3);
            foto_Calon4 = (ImageView) itemView.findViewById(R.id.imageFotoCalon4);
            foto_Wakil1 = (ImageView) itemView.findViewById(R.id.imageFotoWakil1);
            foto_Wakil2 = (ImageView) itemView.findViewById(R.id.imageFotoWakil2);
            foto_Wakil3 = (ImageView) itemView.findViewById(R.id.imageFotoWakil3);
            foto_Wakil4 = (ImageView) itemView.findViewById(R.id.imageFotoWakil4);
            nama_Calon1 = (TextView) itemView.findViewById(R.id.textNamaCalon1);
            nama_Calon2 = (TextView) itemView.findViewById(R.id.textNamaCalon2);
            nama_Calon3 = (TextView) itemView.findViewById(R.id.textNamaCalon3);
            nama_Calon4 = (TextView) itemView.findViewById(R.id.textNamaCalon4);
            nama_Wakil1 = (TextView) itemView.findViewById(R.id.textNamaWakil1);
            nama_Wakil2 = (TextView) itemView.findViewById(R.id.textNamaWakil2);
            nama_Wakil3 = (TextView) itemView.findViewById(R.id.textNamaWakil3);
            nama_Wakil4 = (TextView) itemView.findViewById(R.id.textNamaWakil4);

            jml_pengamat = (TextView) itemView.findViewById(R.id.statusPengamat);
            jml_pengawas = (TextView) itemView.findViewById(R.id.statusPengawas);
            jml_saksi    = (TextView) itemView.findViewById(R.id.statusSaksi);
            /*
            personName = (TextView)itemView.findViewById(R.id.person_name);
            personAge = (TextView)itemView.findViewById(R.id.person_age);
            personPhoto1 = (ImageView)itemView.findViewById(R.id.person_photo1);
            personPhoto2 = (ImageView)itemView.findViewById(R.id.person_photo2);
            */
        }
    }

    List<Kandidat> kandidats;

    ContestCardAdapter(List<Kandidat> kandidats){
        this.kandidats = kandidats;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public KandidatViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_contest, viewGroup, false);
        KandidatViewHolder pvh = new KandidatViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(KandidatViewHolder kandidatViewHolder, int i) {
        kandidatViewHolder.nama_Jabatan.setText(kandidats.get(i).namaJabatan);
        kandidatViewHolder.daerah_Jabatan.setText(kandidats.get(i).daerahJabatan);
        kandidatViewHolder.daerah_Uplevel.setText(kandidats.get(i).daerahUplevel);
        kandidatViewHolder.foto_Calon1.setImageResource(kandidats.get(i).fotoCalon1);
        kandidatViewHolder.foto_Calon2.setImageResource(kandidats.get(i).fotoCalon2);
        kandidatViewHolder.foto_Calon3.setImageResource(kandidats.get(i).fotoCalon3);
        kandidatViewHolder.foto_Calon4.setImageResource(kandidats.get(i).fotoCalon4);
        kandidatViewHolder.foto_Wakil1.setImageResource(kandidats.get(i).fotoWakil1);
        kandidatViewHolder.foto_Wakil2.setImageResource(kandidats.get(i).fotoWakil2);
        kandidatViewHolder.foto_Wakil3.setImageResource(kandidats.get(i).fotoWakil3);
        kandidatViewHolder.foto_Wakil4.setImageResource(kandidats.get(i).fotoWakil4);
        kandidatViewHolder.nama_Calon1.setText(kandidats.get(i).namaCalon1);
        kandidatViewHolder.nama_Calon2.setText(kandidats.get(i).namaCalon2);
        kandidatViewHolder.nama_Calon3.setText(kandidats.get(i).namaCalon3);
        kandidatViewHolder.nama_Calon4.setText(kandidats.get(i).namaCalon4);
        kandidatViewHolder.nama_Wakil1.setText(kandidats.get(i).namaWakil1);
        kandidatViewHolder.nama_Wakil2.setText(kandidats.get(i).namaWakil2);
        kandidatViewHolder.nama_Wakil3.setText(kandidats.get(i).namaWakil3);
        kandidatViewHolder.nama_Wakil4.setText(kandidats.get(i).namaWakil4);
        kandidatViewHolder.jml_pengamat.setText(kandidats.get(i).jmlPengamat);
        kandidatViewHolder.jml_pengawas.setText(kandidats.get(i).jmlPengawas);
        kandidatViewHolder.jml_saksi.setText(kandidats.get(i).jmlSaksi);
        /*
        kandidatViewHolder.personName.setText(kandidats.get(i).name);
        kandidatViewHolder.personAge.setText(kandidats.get(i).age);
        kandidatViewHolder.personPhoto1.setImageResource(kandidats.get(i).photoId1);
        kandidatViewHolder.personPhoto2.setImageResource(kandidats.get(i).photoId2);
        */
    }

    @Override
    public int getItemCount() {
        return kandidats.size();
    }
}