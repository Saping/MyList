package com.example.administrator.mylist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RecyclerViewItemClickListener {

    private RecyclerView recycler;
    private List<String> list;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取控件  创建数据源
        initView();
        //设置布局管理器 ，  设置适配器
        recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        //有传接口
        myAdapter = new MyAdapter(MainActivity.this, list, this);
        recycler.setAdapter(myAdapter);

    }

    //实现接口，重写的方法
    @Override
    public void setOnRecyclerViewItemClickListener(int pstn) {
        myAdapter.setThisPosition(pstn);
        //嫑忘记刷新适配器  刷新适配器我觉得就是重新走了一遍设配器，这个时候我的thisPosition就已经有值了
        myAdapter.notifyDataSetChanged();
    }

    private void initView() {
        recycler = (RecyclerView) findViewById(R.id.recycler);
        //首先创建集合 作为数据源
        list = new ArrayList<>();
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
        list.add("推荐分类");
    }


}
