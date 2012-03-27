package com.stripbandunk.kontak.view;

import android.app.Activity;
import android.widget.Button;

import com.stripbandunk.kontak.R;
import com.stripbandunk.kontak.action.ViewTambahActivityAction;
import com.stripbandunk.kontak.action.ViewTampilActivityAction;

public class MenuForm {

	private Activity activity;
	private Button buttonTambah;
	private Button buttonTampil;

	public MenuForm(Activity activity) {
		this.activity = activity;

		buttonTambah = (Button) activity.findViewById(R.id.buttonTambah);
		buttonTampil = (Button) activity.findViewById(R.id.buttonTampil);

		addAction();
	}

	public Activity getActivity() {
		return activity;
	}

	private void addAction() {
		buttonTambah.setOnClickListener(new ViewTambahActivityAction(this));
		buttonTampil.setOnClickListener(new ViewTampilActivityAction(this));
	}

}
