package practica2;

import java.util.ArrayList;

public class GeneradorGrafo {

	public static Grafo crearGrafo (int nNodos) {
		
		Grafo grafo = new Grafo();
		Integer i = 0;
		while(grafo.getnNodos() < nNodos) {
			
			Nodo nodo = new Nodo("nombre" + i.toString());
			grafo.addNodo(nodo);
			i++;
		}
		
		ArrayList<Nodo> conectados = new ArrayList<Nodo>(); //ArrayList de nodos conectados;
		
		while(conectados.size() != grafo.getnNodos()) {
			int NumAleatorio1 = (int) Math.floor((Math.random() * (grafo.getnNodos())));
			int NumAleatorio2 = (int) Math.ceil((Math.random() * (grafo.getnNodos())))-1;
			int distancia = (int) (Math.random() * 1000);
			 if (NumAleatorio1 != NumAleatorio2) {
				 
				Arista arista = new Arista(grafo.getNodo(NumAleatorio1),grafo.getNodo(NumAleatorio2),distancia);
				if (!grafo.getAristas().contains(arista)) {
					grafo.addArista(arista);
				
				}
				
				
			 }
			 
		}
		
		return grafo;
	}
	
	public static void main(String[] args) {
		
		Grafo prueba = crearGrafo(7);
		System.out.println(prueba.toString());
	}
}
