package com.example.deepak.simpleviewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by deepak on 29/9/17.
 */

public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {
    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void bindData(T data);
}
