package web.service.client.main;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import web.service.client.HotelWebService;
import web.service.client.HotelWebServiceImplService;
public class Main {

	public static void main(String[] args) {
		try {
		URL url = new URL("http://localhost:8080/hotelwebservice?wsdl");
		HotelWebServiceImplService hotelServiceImpl = new HotelWebServiceImplService(url);
		HotelWebService proxy = hotelServiceImpl.getHotelWebServiceImplPort();
		
		Scanner sc = new Scanner(System.in);
		
			
		System.out.println("Entrez le nombre des personnes à héberger : \n");
		int  nbPers = sc.nextInt();
	
		
		System.out.println("Entrez une date d’arrivée : \n");
		int dateArrive = sc.nextInt();
		
		System.out.println("Entrez une date de depart : \n");
		int dateDepart = sc.nextInt();
		float prix = 0;
		
		prix = proxy.recherche(dateArrive, dateDepart, nbPers);
		
		System.out.println("Le prix à payer est de :" + prix);
		
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	
		
	}
	
}


