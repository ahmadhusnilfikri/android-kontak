package com.stripbandunk.kontak.action;

import android.view.View;
import android.view.View.OnClickListener;

import com.stripbandunk.kontak.model.Kontak;
import com.stripbandunk.kontak.view.TambahForm;

public class AddKontakAction implements OnClickListener {

	private TambahForm tambahForm;

	public AddKontakAction(TambahForm tambahForm) {
		this.tambahForm = tambahForm;
	}

	public void onClick(View v) {
		Kontak kontak = new Kontak();
		kontak.nama = tambahForm.getTextNama().getText().toString();
		kontak.telepon = tambahForm.getTextTelepon().getText().toString();
		kontak.email = tambahForm.getTextEmail().getText().toString();

	}

}
