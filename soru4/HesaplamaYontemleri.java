package com.bilgeadam.marathon1.soru4;

public class HesaplamaYontemleri {

	
	public String kareAlan(double kenar)
	{
		double alan = kenar*kenar;
		return "Karenin Alanı : "+alan;
	}
	public String kareCevre(double kenar)
	{
		double cevre = kenar*4;
		return "Karenin Çevresi : "+cevre;
	}
	public String dikdortgenAlan(double kenar1, double kenar2)
	{
		double alan = kenar1*kenar2;
		return "Dikdörtgenin Alanı : "+alan;
	}
	public String dikdortgenCevre(double kenar1, double kenar2)
	{
		double cevre = 2*(kenar1+kenar2);
		return "Dikdörtgenin Çevresi : "+cevre;
	}
	public String daireAlan(double yaricap)
	{
		double alan = 3.14*yaricap*yaricap;
		return  "Dairenin Alanı : "+alan;
	}
	public String daireCevre(double yaricap)
	{
		double cevre = 2*3.14*yaricap;
		return "Dairenin Çevresi : "+cevre;
	}
}
