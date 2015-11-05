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

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder> {

    public static class PersonViewHolder extends RecyclerView.ViewHolder {

        CardView cv;
        TextView personName;
        TextView personAge;
        ImageView personPhoto1;
        ImageView personPhoto2;

        PersonViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            personName = (TextView)itemView.findViewById(R.id.person_name);
            personAge = (TextView)itemView.findViewById(R.id.person_age);
            personPhoto1 = (ImageView)itemView.findViewById(R.id.person_photo1);
            personPhoto2 = (ImageView)itemView.findViewById(R.id.person_photo2);
        }
    }

    List<Kandidat> kandidats;

    RVAdapter(List<Kandidat> kandidats){
        this.kandidats = kandidats;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder, int i) {
        personViewHolder.personName.setText(kandidats.get(i).name);
        personViewHolder.personAge.setText(kandidats.get(i).age);
        personViewHolder.personPhoto1.setImageResource(kandidats.get(i).photoId1);
        personViewHolder.personPhoto2.setImageResource(kandidats.get(i).photoId2);
    }

    @Override
    public int getItemCount() {
        return kandidats.size();
    }
}