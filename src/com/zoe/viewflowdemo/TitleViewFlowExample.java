package com.zoe.viewflowdemo;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;

import com.zoe.viewflowdemo.widget.TitleFlowIndicator;
import com.zoe.viewflowdemo.widget.ViewFlow;

public class TitleViewFlowExample extends Activity{
	private ViewFlow viewFlow;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.title_layout);
		
		viewFlow = (ViewFlow) findViewById(R.id.viewflow);
		AndroidVersionAdapter adapter = new AndroidVersionAdapter(this);
		viewFlow.setAdapter(adapter, 3);
		TitleFlowIndicator indicator = (TitleFlowIndicator) findViewById(R.id.viewflowindic);
		indicator.setTitleProvider(adapter);
		viewFlow.setFlowIndicator(indicator);
	}
	
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		viewFlow.onConfigurationChanged(newConfig);
	}

}
