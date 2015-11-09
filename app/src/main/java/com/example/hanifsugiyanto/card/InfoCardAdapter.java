package com.example.hanifsugiyanto.card;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Sikikan on 11/9/2015.
 */
public class InfoCardAdapter extends RecyclerView.Adapter<InfoCardAdapter.InfoViewHolder>{

    public static class InfoViewHolder extends RecyclerView.ViewHolder{
        CardView cv;

        TextView isiInfo;

        InfoViewHolder(View itemView){
            super (itemView);
            cv = (CardView) itemView.findViewById(R.id.card_info);
            isiInfo = (TextView) itemView.findViewById(R.id.textInfoCard);
        }

    }

    List<Info> infos;

    InfoCardAdapter(List<Info> infos) { this.infos = infos;  }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView){
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public InfoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_info, viewGroup, false);
        InfoViewHolder pvh = new InfoViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(InfoViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return infos.size();
    }
}
