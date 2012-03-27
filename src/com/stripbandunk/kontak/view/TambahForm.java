package com.stripbandunk.kontak.view;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

import com.stripbandunk.kontak.R;
import com.stripbandunk.kontak.action.AddKontakAction;

public class TambahForm {

	public Activity activity;
	private EditText textNama;
	private EditText textTelepon;
	private EditText textEmail;
	private Button buttonTambahKontak;

	public TambahForm(Activity activity) {
		this.activity = activity;

		textEmail = (EditText) activity.findViewById(R.id.editTextEmail);
		textNama = (EditText) activity.findViewById(R.id.editTextNama);
		textTelepon = (EditText) activity.findViewById(R.id.editTextTelepon);
		buttonTambahKontak = (Button) activity
				.findViewById(R.id.buttonTambahKontak);

		addAction();
	}

	private void addAction() {
		buttonTambahKontak.setOnClickListener(new AddKontakAction(this));
	}

	public void reset() {
		textEmail.setText("");
		textNama.setText("");
		textTelepon.setText("");
	}

	public EditText getTextNama() {
		return textNama;
	}

	public EditText getTextEmail() {
		return textEmail;
	}

	public Activity getActivity() {
		return activity;
	}

	public EditText getTextTelepon() {
		return textTelepon;
	}

	public Button getButtonTambahKontak() {
		return buttonTambahKontak;
	}

}
