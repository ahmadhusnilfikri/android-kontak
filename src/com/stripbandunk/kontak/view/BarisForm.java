package com.stripbandunk.kontak.view;

import com.stripbandunk.kontak.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BarisForm {

	private Context context;
	private View view;
	private TextView textViewNama;
	private TextView textViewTelepon;
	private TextView textViewEmail;

	public BarisForm(Context context, ViewGroup root) {
		super();
		this.context = context;

		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		view = inflater.inflate(R.layout.baris, root, false);

		textViewEmail = (TextView) view.findViewById(R.id.rowEmail);
		textViewNama = (TextView) view.findViewById(R.id.rowNama);
		textViewTelepon = (TextView) view.findViewById(R.id.rowTelepon);
	}

	public Context getContext() {
		return context;
	}

	public TextView getTextViewEmail() {
		return textViewEmail;
	}

	public TextView getTextViewNama() {
		return textViewNama;
	}

	public TextView getTextViewTelepon() {
		return textViewTelepon;
	}

	public View getView() {
		return view;
	}

}
