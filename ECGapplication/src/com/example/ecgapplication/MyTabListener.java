package com.example.ecgapplication;
import android.app.ActionBar.Tab;
//import android.app.ActionBar.TabListener;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.ActionBar;
//import android.app.Fragment;
//import android.app.FragmentTransaction;
//import android.os.Bundle;
//import android.support.v4.app.FragmentActivity;
//import android.view.Gravity;
//import android.view.LayoutInflater;
//import android.view.Menu;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;

public class MyTabListener implements ActionBar.TabListener {
	
	Fragment fragment;
	
	public MyTabListener(Fragment fragment) {
		this.fragment = fragment;
	}
	
    public void onTabSelected(Tab tab, FragmentTransaction ft) {
		ft.replace(R.id.fragment_container, fragment);
	}
	
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		ft.remove(fragment);
	}
	
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// nothing done here
	}
}