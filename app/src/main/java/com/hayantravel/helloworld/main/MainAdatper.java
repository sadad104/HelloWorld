package com.hayantravel.helloworld.main;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hayantravel.helloworld.R;

import java.util.List;

/**
 * Created by macbookpro on 2018. 3. 21..
 */

public class MainAdatper extends RecyclerView.Adapter<VHMain> {

    private List<String> list;

    public void setData(List<String> dataList) {
        this.list = dataList;
    }

    @NonNull
    @Override
    public VHMain onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.vh_main, parent, false);
        VHMain vhMain = new VHMain(v);
        return vhMain;
    }

    @Override
    public void onBindViewHolder(@NonNull VHMain holder, int position) {
        TextView tv = holder.itemView.findViewById(R.id.txtTitle);
        tv.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

}
