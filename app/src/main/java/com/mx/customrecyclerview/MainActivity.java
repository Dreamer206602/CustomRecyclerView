package com.mx.customrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.zhy.base.adapter.ViewHolder;
import com.zhy.base.adapter.recyclerview.CommonAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.recyclerView)
    CustomeRecyclerView mRecyclerView;
    @Bind(R.id.recyclerView2)
    CustomeRecyclerView mRecyclerView2;
    @Bind(R.id.recyclerView3)
    CustomeRecyclerView mRecyclerView3;
    private List<Integer> mDatas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mDatas = new ArrayList<>(Arrays.asList(
                R.mipmap.a,
                R.mipmap.b,
                R.mipmap.c,
                R.mipmap.d,
                R.mipmap.e,
                R.mipmap.f,
                R.mipmap.g,
                R.mipmap.h,
                R.mipmap.l));


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRecyclerView2.setLayoutManager(linearLayoutManager2);


        mRecyclerView.setAdapter(new CommonAdapter<Integer>(this, R.layout.item_data, mDatas) {
            @Override
            public void convert(ViewHolder holder, final Integer integer) {
                holder.setImageResource(R.id.id_index_gallery_item_image, integer);


            }
        });
        mRecyclerView2.setAdapter(new CommonAdapter<Integer>(this, R.layout.item_data, mDatas) {
            @Override
            public void convert(ViewHolder holder, final Integer integer) {
                holder.setImageResource(R.id.id_index_gallery_item_image, integer);

            }
        });



    }


}
