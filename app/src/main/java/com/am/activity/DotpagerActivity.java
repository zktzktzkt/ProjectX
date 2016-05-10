package com.am.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.am.widget.R;
import com.am.widget.tabstrips.DotTabStrip;
import com.am.widget.viewpager.ViewsPagerAdapter;

import java.util.ArrayList;

public class DotpagerActivity extends Activity {
	private DotpagerActivity me = this;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.activity_dotpager);
		super.onCreate(savedInstanceState);
		ViewPager pager = (ViewPager) findViewById(R.id.pager);
		View one = new View(me);
		one.setBackgroundColor(0xff00ff00);
		View two = new View(me);
		two.setBackgroundColor(0xffff00ff);
		View three = new View(me);
		three.setBackgroundColor(0xff0000ff);
		ArrayList<View> views = new ArrayList<>();
		views.add(one);
		views.add(two);
		views.add(three);
		ViewsPagerAdapter adapter = new ViewsPagerAdapter(views);
		pager.setAdapter(adapter);

		DotTabStrip dot = (DotTabStrip) findViewById(R.id.dot);
		dot.bindViewPager(pager);
	}
}
