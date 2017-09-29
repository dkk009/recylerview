package com.example.deepak.simpleviewholder;

import android.view.View;
import android.widget.TextView;

/**
 * Created by deepak on 29/9/17.
 */

public class ViewHolderSecond extends BaseViewHolder<String> {

    private TextView textView;
    public ViewHolderSecond(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.txt_string);
    }

    @Override
    public void bindData(String data) {
        textView.setText("Text:" + data);
    }
}
