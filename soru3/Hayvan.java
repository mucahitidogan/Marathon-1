package com.bilgeadam.marathon1.soru3;

public abstract class Hayvan {

	String ad;
	int kilo;
	int uzunluk;
	boolean tehlike;
	String tur;
	
	public abstract String sesCikar();

	public Hayvan(String ad, int kilo, int uzunluk) {
		this.ad = ad;
		this.kilo = kilo;
		this.uzunluk = uzunluk;
	}

	@Override
	public String toString() {
		return "Hayvan [ad=" + ad + ", kilo=" + kilo + ", uzunluk=" + uzunluk + ", tehlikeli mi =" + tehlike + "]";
	}
	
	
}
