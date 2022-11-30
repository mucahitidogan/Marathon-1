package com.bilgeadam.marathon1.soru3;

public class Aslan extends MemeliHayvan{

	
	public Aslan(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
		// TODO Auto-generated constructor stub
	}

		@Override
		public String yuru() {
			
			return " yürüyor...";
			
		}
	
		@Override
		public String sesCikar() {
			
			return " kükrüyor...";
		
	}
	
	
}
