package com.zoe.viewflowdemo;

import android.app.Activity;
import android.os.Bundle;

import com.zoe.viewflowdemo.widget.TitleFlowIndicator;
import com.zoe.viewflowdemo.widget.ViewFlow;

public class AsyncDataFlowExample extends Activity {
	private ViewFlow viewFlow;

    @Override
    public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.title_layout);

		viewFlow = (ViewFlow) findViewById(R.id.viewflow);
		AsyncAdapter adapter = new AsyncAdapter(this);
		viewFlow.setAdapter(adapter, adapter.getTodayId());
		
		TitleFlowIndicator indicator = (TitleFlowIndicator) findViewById(R.id.viewflowindic);
		indicator.setTitleProvider(adapter);
		
		viewFlow.setFlowIndicator(indicator);
    }
}
