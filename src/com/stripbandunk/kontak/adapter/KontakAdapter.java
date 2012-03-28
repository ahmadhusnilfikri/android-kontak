package com.stripbandunk.kontak.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.stripbandunk.kontak.R;
import com.stripbandunk.kontak.model.Kontak;

public class KontakAdapter extends ArrayAdapter<Kontak> {

	public KontakAdapter(Context context, List<Kontak> list) {
		super(context, R.layout.baris, list);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			LayoutInflater inflater = (LayoutInflater) getContext()
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(R.layout.baris, parent, false);
		}

		TextView textViewNama = (TextView) convertView
				.findViewById(R.id.rowNama);
		TextView textViewTelepon = (TextView) convertView
				.findViewById(R.id.rowTelepon);
		TextView textViewEmail = (TextView) convertView
				.findViewById(R.id.rowEmail);

		Kontak kontak = getItem(position);
		textViewNama.setText(kontak.nama);
		textViewTelepon.setText(kontak.telepon);
		textViewEmail.setText(kontak.email);

		return convertView;
	}
}
