package web.service.client.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import web.service.client.HotelWebService;
import web.service.client.HotelWebServiceImplService;

public class WebServiceClientCLI extends AbstractMain{
	public static IntegerInputProcessor inputProcessor;
	
	public static void main(String[] args) {
		WebServiceClientCLI main = new WebServiceClientCLI();
		HotelWebService proxy = null;
		BufferedReader inputReader;
		String userInput = "";
		
		try {
			inputReader = new BufferedReader(
					new InputStreamReader(System.in));
			main.setTestServiceWSDLUrl(inputReader); 
			proxy = getProxy();
			
			do { 
				main.menu();
			    userInput = inputReader.readLine();
			    main.processUserInput(inputReader, userInput, proxy);
			    Thread.sleep(3000);
			} while(!userInput.equals(QUIT)); 
			
		}
		catch (MalformedURLException e) {
			            System.err.println(SERVICE_WSDL_URL+" isn't a valid WSDL URL");
		}
		
		catch (IOException e) { e.printStackTrace();
		}
		
		catch (InterruptedException e) { e.printStackTrace();
		} 
	}
	
	
	
	@Override	
	protected boolean validServiceWSDLUrl() { 
		return SERVICE_WSDL_URL.equals(
            "http://localhost:8080/Hilton.web-service?wsdl");
	}

	private static HotelWebService getProxy()
			throws MalformedURLException {
		return new HotelWebServiceImplService(new URL(SERVICE_WSDL_URL)) .getHotelWebServiceImplPort();
		
	}
	
	
	@Override
	protected void menu() {
		StringBuilder builder = new StringBuilder();
		builder.append(QUIT+". Quit.");
		builder.append("\n1. recherche"); 
		builder.append("\n2. recherche2"); 
		builder.append("\n3. reserver"); 
		System.out.println(builder);
	}
	
	private void processUserInput(BufferedReader reader, String userInput, HotelWebService proxy) {
		try {
			switch(userInput) {
		
				case "1": invokeServiceRecherche(
						new IntegerInputProcessor(reader),
						new IntegerInputProcessor(reader),
						new IntegerInputProcessor(reader),
						proxy,
						"recherche");
					break;
			
				case QUIT: 
					System.out.println("Bye...");
					return;
				default:
					System.err.println("Sorry, wrong input. Please try again.");
					return;
			}
		}
			catch (IOException e) {
		        e.printStackTrace();
		    }
	}
	
	private static void recoverStringParam(BufferedReader reader) {
		System.out.println("Veuillez entre un string");
		try {
			String str = reader.readLine();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * on utilise la methode recherche du server*/

	private static void invokeServiceRecherche(IntegerInputProcessor param1Processor,
			IntegerInputProcessor param2Processor, IntegerInputProcessor param3Processor,
			HotelWebService proxy,
			String operationName) throws IOException {
		inputProcessor = param1Processor;
		int a = inputProcessor.process();// date d'arrivée
		inputProcessor = param2Processor;
		int b = inputProcessor.process();// date de depart
		inputProcessor = param3Processor;
		int c = inputProcessor.process();// nombre de personnes à loger
		
		switch(operationName) {
			case "recherche":
		
			System.out.println("Le prix à payer est de : "+ (proxy.recherche(a, b,c))+" euros"); System.out.println();
			break;
		}
	}
			
	
}
