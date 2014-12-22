package com.Riqki0226.tebakgambartugas;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Petunjuk extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_petunjuk);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.petunjuk, menu);
		return true;
	}

}
