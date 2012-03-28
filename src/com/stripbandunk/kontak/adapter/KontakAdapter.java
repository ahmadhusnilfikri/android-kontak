package com.stripbandunk.kontak.adapter;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.stripbandunk.kontak.R;
import com.stripbandunk.kontak.model.Kontak;
import com.stripbandunk.kontak.view.BarisForm;

public class KontakAdapter extends ArrayAdapter<Kontak> {

	private BarisForm form;

	public KontakAdapter(Context context, List<Kontak> list) {
		super(context, R.layout.baris, list);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			form = new BarisForm(getContext(), parent);
			convertView = form.getView();
		}

		Kontak kontak = getItem(position);
		form.getTextViewNama().setText(kontak.nama);
		form.getTextViewTelepon().setText(kontak.telepon);
		form.getTextViewEmail().setText(kontak.email);

		return convertView;
	}
}
