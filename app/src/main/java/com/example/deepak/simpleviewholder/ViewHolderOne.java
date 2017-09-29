package com.example.deepak.simpleviewholder;

import android.view.View;
import android.widget.TextView;

/**
 * Created by deepak on 29/9/17.
 */

public class ViewHolderOne extends BaseViewHolder<Integer> {

    private TextView txtView;
    public ViewHolderOne(View itemView) {
        super(itemView);
        txtView = itemView.findViewById(R.id.txt_number);
    }

    @Override
    public void bindData(Integer data) {
        txtView.setText("Number:" + data);
    }
}
