package com.zoe.viewflowdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.zoe.viewflowdemo.widget.TitleFlowIndicator;
import com.zoe.viewflowdemo.widget.ViewFlow;

public class DiffViewFlowExample extends Activity {
	private ViewFlow viewFlow;
	private ListView listView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.title_layout);
		viewFlow = (ViewFlow) findViewById(R.id.viewflow);
		DiffAdapter adapter = new DiffAdapter(this);
		viewFlow.setAdapter(adapter);
		TitleFlowIndicator indicator = (TitleFlowIndicator) findViewById(R.id.viewflowindic);
		indicator.setTitleProvider(adapter);
		viewFlow.setFlowIndicator(indicator);

		listView = (ListView) findViewById(R.id.listView1);
		String[] names = new String[] { "Cupcake", "Donut", "Eclair", "Froyo",
				"Gingerbread", "Honeycomb", "IceCream Sandwich" };
		listView.setAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, names));
	}
}
