package test_socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.TreeMap;

public class Server {

	

	public static void main(String[] args) {
		
		try (ServerSocket server = new ServerSocket(1234);) {
			System.out.println("serveur démarré");
			while (true) {
				try {
					
					Socket client = server.accept();
					
					new Thread(new Traitement(client)).start();//le thread donne Traitement et appelle la méthode run
					
					
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		System.out.println("serveur arrêté");
	}
	

}

//	public static void main(String[] args) {
//		try(ServerSocket hostServer = new ServerSocket(5678);){		
//			System.out.println("serveur démarré");
//			while(true){
//				try (Socket socket = hostServer.accept();// attente de la connexion d’un client	
//						PrintWriter out = new PrintWriter(socket.getOutputStream(), true); //boolean autoflush	
//						BufferedReader in = new BufferedReader( new InputStreamReader(socket.getInputStream()) );
//						){ 			
//					
//					System.out.println("requete reçue du client");
//					System.out.println("serveur a reçu : " + in.readLine());
//					out.println("bien reçu, je suis un serveur");
//					System.out.println("requete traitée par le serveur");
//				}
//				catch (IOException ex){
//					ex.printStackTrace();
//				}
//				
//			}
//			
//		} catch (IOException ex) {
//			ex.printStackTrace();
//		}
//
//	}


