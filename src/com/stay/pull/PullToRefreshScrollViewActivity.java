package com.stay.pull;

import com.stay.pull.lib.PullToRefreshScrollView;
import com.stay.pull.lib.PullToRefreshWebView;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ScrollView;
import android.widget.Toast;

public class PullToRefreshScrollViewActivity extends Activity {
	PullToRefreshScrollView mPullRefreshScrollView;
	ScrollView mScrollView;
	LayoutInflater inflater;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pull_to_refresh_scrollview);
		inflater = LayoutInflater.from(this);
		mPullRefreshScrollView = (PullToRefreshScrollView) findViewById(R.id.pull_refresh_scrollview);
		mScrollView = mPullRefreshScrollView.getRefreshableView();
		View view = inflater.inflate(R.layout.text, null);
		mScrollView.addView(view);
		
		mScrollView.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				
			}
		});
		
		
	}
	

}
