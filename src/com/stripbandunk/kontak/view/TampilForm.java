package com.stripbandunk.kontak.view;

import com.stripbandunk.kontak.R;
import com.stripbandunk.kontak.db.KontakDatabase;
import com.stripbandunk.kontak.model.Kontak;

import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
		ArrayAdapter<Kontak> adapter = new ArrayAdapter<Kontak>(activity,
				android.R.layout.simple_list_item_1, database.findAll());
		listViewKontak.setAdapter(adapter);
	}

	public Activity getActivity() {
		return activity;
	}

	public ListView getListViewKontak() {
		return listViewKontak;
	}

}
