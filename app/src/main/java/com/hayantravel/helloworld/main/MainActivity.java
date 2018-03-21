package com.hayantravel.helloworld.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;

import com.hayantravel.helloworld.R;

import java.util.Arrays;

/**
 * Created by macbookpro on 2018. 3. 21..
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        MainAdatper adatper = new MainAdatper();
        adatper.setData(Arrays.asList("a", "b", "c"));
        recyclerView.setAdapter(adatper);
    }

}
