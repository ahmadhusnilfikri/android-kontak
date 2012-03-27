package com.stripbandunk.kontak.db;

import java.util.ArrayList;
import java.util.List;

import com.stripbandunk.kontak.model.Kontak;

public class KontakDatabase {

	private static final KontakDatabase KONTAK_DATABASE = new KontakDatabase();

	public static KontakDatabase getInstance() {
		return KontakDatabase.KONTAK_DATABASE;
	}

	private List<Kontak> list = new ArrayList<Kontak>();

	private KontakDatabase() {
		// singleton class
	}

	public void add(Kontak kontak) {
		list.add(kontak);
	}

	public List<Kontak> findAll() {
		return list;
	}

}
