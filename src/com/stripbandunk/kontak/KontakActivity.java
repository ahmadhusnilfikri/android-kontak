package com.stripbandunk.kontak;

import android.app.Activity;
import android.os.Bundle;

import com.stripbandunk.kontak.view.MenuForm;

public class KontakActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		new MenuForm(this);
	}
}