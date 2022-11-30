package com.bilgeadam.marathon1.soru2;

public class Dizi {

	public static void tekrarlananKontrolDizi(int[] dizi) {
		
		
		int sayac = 1;
		int sayi = 0;
		for(int i =0; i <dizi.length;i++)
		{
			sayi = dizi[i];
			
			for(int j =i+1; j<dizi.length;j++)
			{
				if(sayi==dizi[j])
				{
					i=dizi.length;
					sayac++;
				}
			}
			
		}
		
		if(sayac==1)
		{
			System.out.println("Tekrar eden sayı bulunamamıştır.");
		}
		else
		{
			System.out.println(sayi+" sayısı "+sayac+" kez tekrar ediyor.");
		}
		
	}

}
