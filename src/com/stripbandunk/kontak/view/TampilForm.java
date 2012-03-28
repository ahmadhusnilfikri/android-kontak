package com.stripbandunk.kontak.view;

import android.app.Activity;
import android.widget.ListView;

import com.stripbandunk.kontak.R;
import com.stripbandunk.kontak.adapter.KontakAdapter;
import com.stripbandunk.kontak.db.KontakDatabase;

public class TampilForm {

	private Activity activity;
	private ListView listViewKontak;

	public TampilForm(Activity activity) {
		this.activity = activity;
		this.listViewKontak = (ListView) activity.findViewById(R.id.listTampil);

		loadKontak();
	}

	private void loadKontak() {
		KontakDatabase database = KontakDatabase.getInstance();
		KontakAdapter adapter = new KontakAdapter(activity, database.findAll());
		listViewKontak.setAdapter(adapter);
	}

	public Activity getActivity() {
		return activity;
	}

	public ListView getListViewKontak() {
		return listViewKontak;
	}

}
