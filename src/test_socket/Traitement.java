package test_socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Traitement implements Runnable {

	private final Socket client;
	private Map<String, Socket> users = new TreeMap<>();

	public Traitement(Socket client) {
		this.client = client;
	}

	// la méthode run ne throw aucune exception dans Runnable, on doit donc faire un try catch
	@Override
	public void run() {
		try (Socket socket = client;
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
				Scanner sc = new Scanner(System.in); ) {
			
			System.out.println("Bienvenue sur le serveur");
			System.out.println("Entrez votre nom : ");
				
			
			String nom = sc.nextLine();

			System.out.println(nom + " s'est connecté");
			out.println("Bienvenue " + nom + " !");
			users.put(nom, socket);

			System.out.println("l'utilisateur "+ nom + " a bien été ajouté");
			
			
			
//			System.out.println("serveur : requete client reçue");
//			System.out.println("serveur à recu : " + in.readLine());
//			out.println("bien recu, je suis Marie");
//			System.out.println("serveur : requete client traitée");
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}