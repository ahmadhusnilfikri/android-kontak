package com.stripbandunk.kontak.action;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

import com.stripbandunk.kontak.TambahActivity;
import com.stripbandunk.kontak.view.MenuForm;

public class ViewTambahActivityAction implements OnClickListener {

	private MenuForm form;

	public ViewTambahActivityAction(MenuForm form) {
		super();
		this.form = form;
	}

	public void onClick(View v) {
		Intent intent = new Intent(form.getActivity(), TambahActivity.class);
		form.getActivity().startActivity(intent);
	}

}
