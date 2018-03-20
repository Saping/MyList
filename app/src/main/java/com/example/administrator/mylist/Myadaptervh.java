package com.example.administrator.mylist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Administrator on 2018/3/20.
 */

public class Myadaptervh extends RecyclerView.ViewHolder {

    public TextView iteam;

    public Myadaptervh(View itemView) {
        super(itemView);
        iteam = itemView.findViewById(R.id.iteam);
    }
}
