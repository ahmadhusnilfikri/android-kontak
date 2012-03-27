package com.stripbandunk.kontak.view;

import com.stripbandunk.kontak.R;

import android.app.Activity;
import android.widget.ListView;

public class TampilForm {

	private Activity activity;
	private ListView listViewKontak;

	public TampilForm(Activity activity) {
		this.activity = activity;
		this.listViewKontak = (ListView) activity.findViewById(R.id.listTampil);
	}

	public Activity getActivity() {
		return activity;
	}

	public ListView getListViewKontak() {
		return listViewKontak;
	}

}
