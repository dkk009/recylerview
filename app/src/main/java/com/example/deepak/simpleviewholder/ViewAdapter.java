package com.example.deepak.simpleviewholder;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by deepak on 29/9/17.
 */

public class ViewAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    private ArrayList<Object> dataList;
    public ViewAdapter(ArrayList<Object> dataList) {
        this.dataList = dataList;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        BaseViewHolder baseViewHolder;

        if(viewType == 0) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_one,parent,false);
            baseViewHolder  = new ViewHolderOne(view);
        }else  {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_two,parent,false);
            baseViewHolder  = new ViewHolderSecond(view);
        }
        return baseViewHolder;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.bindData(dataList.get(position));
    }

    @Override
    public int getItemViewType(int position) {
        Object obj = dataList.get(position);
        int type = 0;
        if(obj instanceof Integer) {
            type = 0;
        }else if(obj instanceof String) {
            type = 1;
        }
        return type;
    }

    @Override
    public int getItemCount() {
        return dataList != null ? dataList.size() : 0;
    }
}
