package com.example.vilap;

import android.support.v7.app.ActionBarActivity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

public class CustomAcitionBar {
	public static void setActionBar(ActionBarActivity activity)
	{
		ViewGroup actionBarLayout = (ViewGroup) activity.getLayoutInflater().inflate(R.layout.custom_actionbar, null);
		
		android.support.v7.app.ActionBar actionBar = activity.getSupportActionBar();
		actionBar.setDisplayShowHomeEnabled(false);
		actionBar.setDisplayShowTitleEnabled(false);
		actionBar.setDisplayShowCustomEnabled(true);
		actionBar.setCustomView(actionBarLayout);
		
//		Button drawerButton = (Button) actionBarLayout.findViewById(R.id.actionbar_button_drawer_layout);
//		
//		RelativeLayout layout = (RelativeLayout) actionBarLayout.findViewById(R.id.custom_actionbar_relativelayout_main);
		
//		if(android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.JELLY_BEAN)
//			layout.setBackgroundDrawable(buildGradient(activity));
//		else
//			layout.setBackground(buildGradient(activity));
	}

}
