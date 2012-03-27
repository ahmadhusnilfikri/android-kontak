package com.stripbandunk.kontak;

import com.stripbandunk.kontak.view.TampilForm;

import android.app.Activity;
import android.os.Bundle;

public class TampilActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tampil);

		new TampilForm(this);
	}
}
