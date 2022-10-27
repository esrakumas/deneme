package deneme;
import java.util.Scanner;
import java.util.Scanner;

public class kurelslls {

	public static void main(String[] args) {
int dogru=0;
		
		Scanner girdi= new Scanner(System.in);
	
		String cevaplar[]= {"A","a","B","b","c","C","C","c","a","A"};
		
	
		
		//1.SORU
	
		System.out.println("1. Hangi ulke en cok sera gazi yaymaktadir?");
		System.out.println("a)Cin\r\n" + "b)Hindistan\r\n" + "c)Amerika\r\n" + "d)Japonya");
		String cevap = girdi.nextLine();
	    
	    
	    if(cevaplar[0].equals(cevap)||cevaplar[1].equals(cevap)) {
	    	System.out.println("DOGRU/n"); 
	    	dogru++;}
	    	
	    else {
	    		System.out.println("YANLIS/n");}
	    	
	    //2.SORU
	    
		System.out.println("2. Hangi gezegenin atmosferi kuresel isinma ile yok edilmektedir?");
		System.out.println("a)Jüpiter\r\n"+ "b)Venüs\r\n"+ "c)Mars\r\n"+ "d)Merkür");
		String cevap1 = girdi.nextLine();
		
	    if(cevaplar[2].equals(cevap1)||cevaplar[3].equals(cevap1)) {
	    	System.out.println("DOGRU/n");  
	    	dogru++;}
	    else {
	    		System.out.println("YANLIS/n");}
	    
	    //3.SORU
	    
	    System.out.println("3. Hangi tur ampul en az enerjiyi tUketir?");
		System.out.println("a)Akkor Ampul\r\n"+ "b)Halojen Ampul\r\n"+ "c)Kompakt Floresan Ampul");
		String cevap2 = girdi.nextLine();
		
	    if(cevaplar[4].equals(cevap2)||cevaplar[5].equals(cevap2)) {
	    	System.out.println("DOGRU/n");  
	    	dogru++;}
	    else {
	    		System.out.println("YANLIS/n");}
	    	
	    
	    //4.SORU
	    
	    System.out.println("4. İklim degişikligi nedeniyle yilda kaç kişi olmektedir?");
		System.out.println("a)1500\r\n"+ "b)100.000\r\n"+ "c)150.000\r\n"+ "d)500.000");
		String cevap3 = girdi.nextLine();
		
	    if(cevaplar[6].equals(cevap3)||cevaplar[7].equals(cevap3)) {
	    	System.out.println("DOGRU/n");
	    	dogru++;}
	    else {
	    		System.out.println("YANLIS/n");}
	    
	    //5.SORU
	    
	    System.out.println("5. asagıdakilerin hangisi kuresel isinmain olumsuz bir etkisi degildir?");
			System.out.println("a)Daha buyuk balik nüfusu.\r\n"+ "b)Yeni bulaşıcı hastalıkların ortaya çıkması.\r\n"+ "c)Türlerin yok olması.\r\n"+ "d)Kıyı alanlarının kaybı.");
			String cevap4 = girdi.nextLine();
			
		    if(cevaplar[8].equals(cevap4)||cevaplar[9].equals(cevap4)) {
		    	System.out.println("DOGRU/n");  
		    	dogru++;}
		    else {
		    		System.out.println("YANLIS/n");}
		    
		    
		   if(dogru==5) {
			   System.out.println("mukemmel");}
		   else if(dogru==4) {
			   System.out.println("cok iyi");}
		   else
		   {
			   System.out.println("gelistiriniz");
		 	}
		
	}
	}


