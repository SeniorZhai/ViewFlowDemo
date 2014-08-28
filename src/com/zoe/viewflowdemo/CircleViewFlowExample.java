package com.zoe.viewflowdemo;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;

import com.zoe.viewflowdemo.widget.CircleFlowIndicator;
import com.zoe.viewflowdemo.widget.ViewFlow;

public class CircleViewFlowExample extends Activity {
	private ViewFlow viewFlow;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.circle_layout);

		viewFlow = (ViewFlow) findViewById(R.id.viewflow);
		viewFlow.setAdapter(new ImageAdapter(this), 5);
		CircleFlowIndicator indic = (CircleFlowIndicator) findViewById(R.id.viewflowindic);
		viewFlow.setFlowIndicator(indic);
	}
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		viewFlow.onConfigurationChanged(newConfig);
	}
}
