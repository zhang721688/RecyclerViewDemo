package com.think.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;

public class RecyclerView5DemoAcitity extends AppCompatActivity {

    protected RecyclerView rv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_recycler_view1_demo_acitity);
        initView();

    }

    private void initView() {
        //实例化RecyclerView
        rv1 = (RecyclerView) findViewById(R.id.rv1);

        //设置固定大小,设置条目固定大小.
        rv1.setHasFixedSize(true);
        //创建线性布局,//垂直方向
        //给RecyclerView设置布局管理器
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);

        //设置方向横向列表.
        //manager.setOrientation(OrientationHelper.HORIZONTAL);
        rv1.setLayoutManager(manager);

        //创建并设置分割线
        //参数:1,上下文.2,布局方向.
        rv1.addItemDecoration(new DecorationVertical(this, OrientationHelper.VERTICAL));
        //创建适配器，并且设置
        rv1.setAdapter(new Rv1Adapter());

    }
}
