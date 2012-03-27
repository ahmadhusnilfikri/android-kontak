package com.stripbandunk.kontak.action;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

import com.stripbandunk.kontak.TampilActivity;
import com.stripbandunk.kontak.view.MenuForm;

public class ViewTampilActivityAction implements OnClickListener {

	private MenuForm form;

	public ViewTampilActivityAction(MenuForm form) {
		super();
		this.form = form;
	}

	public void onClick(View v) {
		Intent intent = new Intent(form.getActivity(), TampilActivity.class);
		form.getActivity().startActivity(intent);
	}

}
