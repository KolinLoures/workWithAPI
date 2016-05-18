package com.example.nkirilov.workwithapi;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by n.kirilov on 18.05.2016.
 */
public class PhotoAdapter extends RecyclerView.Adapter<PhotoAdapter.PhotoHolder> {


    @Override
    public PhotoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        PhotoHolder photoHolder = new PhotoHolder(layoutInflater.inflate(R.layout.item_rv, parent, false));
        return photoHolder;
    }

    @Override
    public void onBindViewHolder(PhotoHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 0;
    }

    public static class PhotoHolder extends RecyclerView.ViewHolder{

        public PhotoHolder(View itemView) {
            super(itemView);
        }


    }
}
