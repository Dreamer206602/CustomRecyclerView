package com.mx.customrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

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
    @Bind(R.id.recyclerView4)
    CustomeRecyclerView mRecyclerView4;
    @Bind(R.id.recyclerView5)
    CustomeRecyclerView mRecyclerView5;
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


        FullyLinearLayoutManager manager = new FullyLinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        FullyLinearLayoutManager manager2 = new FullyLinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        FullyLinearLayoutManager manager3 = new FullyLinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        FullyLinearLayoutManager manager4 = new FullyLinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        FullyLinearLayoutManager manager5 = new FullyLinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(manager);
        mRecyclerView2.setLayoutManager(manager2);
        mRecyclerView3.setLayoutManager(manager3);
        mRecyclerView4.setLayoutManager(manager4);
        mRecyclerView5.setLayoutManager(manager5);


        mRecyclerView.setAdapter(new CommonAdapter<Integer>(this, R.layout.item_data, mDatas) {
            @Override
            public void convert(ViewHolder holder, final Integer integer) {
                Log.d("MainActivity", "position->" + integer);
                holder.setImageResource(R.id.id_index_gallery_item_image, integer);

                final int position = getPosition(holder);

//                final Integer integer1 = mDatas.get(integer);
//
                holder.setOnClickListener(R.id.id_index_gallery_item_image, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Toast.makeText(MainActivity.this, "position->" + position, Toast.LENGTH_SHORT).show();

                    }
                });


            }
        });

        mRecyclerView2.setAdapter(new CommonAdapter<Integer>(this, R.layout.item_data, mDatas) {
            @Override
            public void convert(ViewHolder holder, final Integer integer) {
                holder.setImageResource(R.id.id_index_gallery_item_image, integer);

                final int position = getPosition(holder);
                holder.setOnClickListener(R.id.id_index_gallery_item_image, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Toast.makeText(MainActivity.this, "position->" + position, Toast.LENGTH_SHORT).show();

                    }
                });

            }
        });
        mRecyclerView3.setAdapter(new CommonAdapter<Integer>(this, R.layout.item_data, mDatas) {
            @Override
            public void convert(ViewHolder holder, final Integer integer) {
                holder.setImageResource(R.id.id_index_gallery_item_image, integer);

                final int position = getPosition(holder);
                holder.setOnClickListener(R.id.id_index_gallery_item_image, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Toast.makeText(MainActivity.this, "position->" + position, Toast.LENGTH_SHORT).show();

                    }
                });

            }
        });mRecyclerView4.setAdapter(new CommonAdapter<Integer>(this, R.layout.item_data, mDatas) {
            @Override
            public void convert(ViewHolder holder, final Integer integer) {
                holder.setImageResource(R.id.id_index_gallery_item_image, integer);

                final int position = getPosition(holder);
                holder.setOnClickListener(R.id.id_index_gallery_item_image, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Toast.makeText(MainActivity.this, "position->" + position, Toast.LENGTH_SHORT).show();

                    }
                });

            }
        });
mRecyclerView5.setAdapter(new CommonAdapter<Integer>(this, R.layout.item_data, mDatas) {
            @Override
            public void convert(ViewHolder holder, final Integer integer) {
                holder.setImageResource(R.id.id_index_gallery_item_image, integer);


                final int position = getPosition(holder);
                holder.setOnClickListener(R.id.id_index_gallery_item_image, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Toast.makeText(MainActivity.this, "position->" + position, Toast.LENGTH_SHORT).show();

                    }
                });

            }
        });


    }


}
