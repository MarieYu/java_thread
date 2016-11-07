package test_socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		
//		String server = "172.16.28.125";
//		int port = 5859;
		String server = "localhost";
		int port = 1234;
		
		System.out.println("Vous tentez de vous connecter à " + server + ":" + port);
		
		try (Socket socket = new Socket(server, port);
				PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				Scanner sc = new Scanner(System.in);) {
							
						
			System.out.println("connexion réussie");
			String entry = in.readLine();
			
//			while (entry != null){
//				
//			}
			
			System.out.println(entry);
			
//			//Test simple
//			out.println("coucou c'est le client Marie");
//			System.out.println("client : requête client envoyée au serveur");
//			System.out.println("client : reponse serveur reçue par le client");
//			System.out.println("client a reçu : " + in.readLine());
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	

//	public static void main(String[] args) {
//		
//		try(Socket socket = new Socket("localhost", 5678);
//				PrintWriter out = new PrintWriter(socket.getOutputStream(), true); //boolean autoflush	
//				BufferedReader in = new BufferedReader( new InputStreamReader(socket.getInputStream()) );
//				) { 
//			out.println("je suis un client");//reçu par le serveur
//			// 
//			System.out.println("requete client envoyée au serveur");
//			//
//			System.out.println("Client a reçu : " + in.readLine());
//						
//		} catch(IOException ex){
//			ex.printStackTrace();
//		}		
//		System.out.println("réponse serveur reçue par le client");
//		
//	}

}
