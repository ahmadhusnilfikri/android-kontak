package com.stripbandunk.kontak;

import com.stripbandunk.kontak.view.TambahForm;

import android.app.Activity;
import android.os.Bundle;

public class TambahActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tambah);

		new TambahForm(this);
	}

}
