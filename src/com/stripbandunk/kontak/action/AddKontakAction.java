package com.stripbandunk.kontak.action;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

import com.stripbandunk.kontak.db.KontakDatabase;
import com.stripbandunk.kontak.model.Kontak;
import com.stripbandunk.kontak.view.TambahForm;

public class AddKontakAction implements OnClickListener {

	private TambahForm tambahForm;

	public AddKontakAction(TambahForm tambahForm) {
		this.tambahForm = tambahForm;
	}

	private void showInvalidMessage(String message, final EditText focus) {
		new AlertDialog.Builder(tambahForm.getActivity())
				.setTitle("Validasi Gagal")
				.setMessage(message)
				.setNeutralButton("Perbaiki",
						new DialogInterface.OnClickListener() {

							public void onClick(DialogInterface dialog,
									int which) {
								focus.requestFocus();
							}
						}).show();
	}

	public void onClick(View v) {
		Kontak kontak = new Kontak();
		kontak.nama = tambahForm.getTextNama().getText().toString();
		kontak.telepon = tambahForm.getTextTelepon().getText().toString();
		kontak.email = tambahForm.getTextEmail().getText().toString();

		if (kontak.nama.trim().isEmpty()) {
			showInvalidMessage("Nama masih kosong", tambahForm.getTextNama());
		} else if (kontak.telepon.trim().isEmpty()) {
			showInvalidMessage("Telepon masih kosong",
					tambahForm.getTextTelepon());
		} else if (kontak.email.trim().isEmpty()) {
			showInvalidMessage("Email masih kosong", tambahForm.getTextEmail());
		} else {
			KontakDatabase database = KontakDatabase.getInstance();
			database.add(kontak);

			tambahForm.reset();
		}
	}
}
