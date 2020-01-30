package com.example.timestable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar seekBar = (SeekBar)findViewById(R.id.seekBar);

        final ListView  tableListView = (ListView)findViewById(R.id.listView);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                ArrayList table = new ArrayList<String>();

                for(int i = 1; i <= 20; i++){
                    table.add((progress*i) + "");
                }

                ArrayAdapter listAdapter = new ArrayAdapter( getApplicationContext(), android.R.layout.simple_list_item_1, table);

                tableListView.setAdapter(listAdapter);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }








}
