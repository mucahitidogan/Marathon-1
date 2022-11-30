package com.bilgeadam.marathon1.soru3;

import java.util.ArrayList;
import java.util.List;

public class HayvanatBahcesi implements IBahceyeMemeliHayvanEkle,IBahceyeSurungenHayvanEkle,
IHayvaniHareketEttir,IHayvaninBilgileriniYazdir,IHayvaninCinsiniBul,IHayvanSesCikarsin{
	Surungen s= null;
	MemeliHayvan m = null;
	Hayvan hayvan = null;
	Aslan a;
	Kertenkele k;
	Maymun may;
	Yilan y;
	List<Hayvan> listMemeliHayvan = new ArrayList<>();
	List<Hayvan> listSurungenHayvan = new ArrayList<>();
	List<Hayvan> listHayvan = new ArrayList<>();
	
	
	
	@Override
	public void hayvanSesCikarsin(Hayvan h) {
		// TODO Auto-generated method stub
		
		System.out.println(h.ad+h.sesCikar());
	}

	@Override
	public void hayvaninCinsiniBul(String hayvanAdi) {
		// TODO Auto-generated method stub
		for(Hayvan h : listSurungenHayvan)
		{
			if(hayvanAdi==h.ad)
			{
				System.out.println(hayvanAdi+" bir Sürüngen");
				break;
			}
		}
		for(Hayvan h : listMemeliHayvan)
		{
			if(hayvanAdi==h.ad)
			{
				System.out.println(hayvanAdi+" bir Memeli Hayvan");
				break;
			}
		}
	}

	@Override
	public void hayvaninBilgileriniYazdir(String hayvanAdi) {
		// TODO Auto-generated method stub
		for(Hayvan h : listMemeliHayvan)
		{
			listHayvan.add(h);
		}
		for(Hayvan h : listSurungenHayvan)
		{
			listHayvan.add(h);
		}
		for(Hayvan h : listHayvan)
		{
			if(hayvanAdi==h.ad)
			{
				System.out.println(h);
				break;
			}
			else
			{
				System.out.println(hayvanAdi+ " isminde bir hayvan Hayvanat Bahçesinde yok");
				break;
			}
		}
		
		
	}

	@Override
	public void hayvaniHareketEttir(String hayvanAdi) {
		// TODO Auto-generated method stub
		for(Hayvan h : listHayvan)
		{
			if(hayvanAdi==h.ad)
			{

					if(h instanceof Yilan)
						System.out.println(hayvanAdi+" isimli yilan");
					else if(h instanceof Kertenkele)
					{
						System.out.println(hayvanAdi+" isimli kertenkele");
					}
					else if(h instanceof Aslan)
					{
						System.out.println(hayvanAdi+" isimli aslan");
					}
					else
					{
						System.out.println(hayvanAdi+" isimli maymun");
					}
				}
	
		}
	
	}

	@Override
	public void bahceyeSurungenHayvanEkle(Surungen s) {
		// TODO Auto-generated method stub
		listSurungenHayvan.add(s);
	}

	@Override
	public void bahceyeMemeliHayvanEkle(MemeliHayvan m) {
		// TODO Auto-generated method stub
		
		listMemeliHayvan.add(m);
 	}


	
//	public void hayvanSesCikarsin(Hayvan h);
//
//	public void hayvaninCinsiniBul(String hayvanAdi);
//
//	public void hayvaninBilgileriniYazdir(String hayvanAdi);
//
//	public void hayvaniHareketEttir(String hayvanAdi);
}
