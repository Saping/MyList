package com.example.administrator.mylist;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Administrator on 2018/3/20.
 */

public class MyAdapter extends RecyclerView.Adapter<Myadaptervh> {

    Context context;
    List<String> list;
    //自定义一个变量 就是说这个值为什么默认为0
    private int thisPosition;
    RecyclerViewItemClickListener recyclerViewItemClickListener;

    //再定义一个int类型的返回值方法   创建两个方法  赋值取值
    public void setThisPosition(int thisPosition) {
        this.thisPosition = thisPosition;
    }

    public int getthisPosition() {
        return thisPosition;
    }

    public MyAdapter(Context context, List<String> list, RecyclerViewItemClickListener recyclerViewItemClickListener) {
        this.context = context;
        this.list = list;
        this.recyclerViewItemClickListener = recyclerViewItemClickListener;
        Log.d("TAG", getthisPosition() + "");
    }

    @Override
    public Myadaptervh onCreateViewHolder(ViewGroup parent, int viewType) {
        //找到布局
        View view = View.inflate(context, R.layout.childlayout, null);
        Myadaptervh myadaptervh = new Myadaptervh(view);
        return myadaptervh;
    }

    //这个onBindViewHolder是循环着走的
    @Override
    public void onBindViewHolder(Myadaptervh holder, final int position) {
        //赋值数据
        holder.iteam.setText(list.get(position));

        //如果 当前条目下标 ==
        if (position == getthisPosition()) {
            holder.iteam.setTextColor(Color.parseColor("#FF4040"));
            holder.iteam.setBackgroundColor(Color.parseColor("#EFEFEF"));
        } else {
            holder.iteam.setTextColor(Color.BLACK);
            holder.iteam.setBackgroundColor(Color.WHITE);
        }
        holder.iteam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerViewItemClickListener.setOnRecyclerViewItemClickListener(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}
