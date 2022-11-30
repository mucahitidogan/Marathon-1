package com.bilgeadam.marathon1.soru3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HayvanatBahcesi hb = new HayvanatBahcesi();
		Aslan aslan = new Aslan("Simba", 100, 120);
		Yilan yilan = new Yilan("Terminator", 40, 225);
		hb.bahceyeMemeliHayvanEkle(aslan);
		hb.bahceyeSurungenHayvanEkle(yilan);
		hb.bahceyeMemeliHayvanEkle(new Aslan("Leo", 120, 140));
		hb.bahceyeMemeliHayvanEkle(new Maymun("Çiko", 45, 50));
		hb.bahceyeSurungenHayvanEkle(new Yilan("Cobra",35,200));
		hb.bahceyeSurungenHayvanEkle(new Kertenkele("Kermit", 2, 35));
		
		hb.hayvanSesCikarsin(aslan);
		hb.hayvanSesCikarsin(yilan);
		System.out.println("-------------------------------------");
		hb.hayvaninBilgileriniYazdir("Simba");
		hb.hayvaninBilgileriniYazdir("Tiger");
		System.out.println("-------------------------------------");
		hb.hayvaniHareketEttir("Cobra");
		hb.hayvaniHareketEttir("Leo");
		hb.hayvaniHareketEttir("Çiko");
		hb.hayvaniHareketEttir("Kermit");
		System.out.println("-------------------------------------");
		hb.hayvaninCinsiniBul("Kermit");
		hb.hayvaninCinsiniBul("Simba");
		hb.hayvaninCinsiniBul("Çiko");
		hb.hayvaninCinsiniBul("Cobra");
		hb.hayvaninCinsiniBul("Tomy");
		
		
		
		
		
		
	}

}
