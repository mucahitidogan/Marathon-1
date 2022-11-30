package com.bilgeadam.marathon1.soru1;

public class Sekil {

	public static void SekilCiz()
	{
		int sayac=7;
		for(int j = 0; j<10; j++)
		{
			if(j>3)
			{	
				sayac--;
			}
			for(int i = 0; i<sayac;i++)
			{
				System.out.print("*");
			}
			System.out.println("\n");
			
		}
			
	}
}
