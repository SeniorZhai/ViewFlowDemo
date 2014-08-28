package com.zoe.viewflowdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends Activity {
	ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        listView = (ListView) findViewById(R.id.menu);
        String[] listeStrings = { "Circle indicator...", "Title indicator...", "Different Views...", "Async Data Loading..." };
		listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listeStrings));
		listView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> adapterView, View view, int position, long arg3) {
				switch (position) {
				case 0:
					startActivity(new Intent(MainActivity.this, CircleViewFlowExample.class));
					break;
				case 1:
					startActivity(new Intent(MainActivity.this, TitleViewFlowExample.class));
					break;
				case 2:
					startActivity(new Intent(MainActivity.this, DiffViewFlowExample.class));
					break;
				case 3:
					startActivity(new Intent(MainActivity.this, AsyncDataFlowExample.class));
					break;
				}
			}
		});
    }
}
