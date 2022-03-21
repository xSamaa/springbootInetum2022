package main.es.inetum.practica0.modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class PiedraPapelTijeraFactory {

	public final static int PIEDRA = 1;
	
	public final static int PAPEL = 2;
	
	public final static int TIJERA = 3;
	
	protected String descripcionResultado;
	
	private static List<PiedraPapelTijeraFactory> elementos;
	
	protected String nombre;
	
	protected int numero;
	


	public PiedraPapelTijeraFactory(String nombre, int numero) {
		super();
		this.nombre = nombre;
		this.numero = numero;
	}

	public abstract boolean isMe(int numeroPiedraPapelTijera);
	
	public abstract int comparar(PiedraPapelTijeraFactory piedraPapelTijeraFactory);
	
	public static PiedraPapelTijeraFactory getInstance(int instanciaPiedraPapelTijera) {
		
		elementos = new ArrayList<PiedraPapelTijeraFactory>();
		
		elementos.add(new Piedra());
		elementos.add(new Papel());
		elementos.add(new Tijera());
		
		for (PiedraPapelTijeraFactory piedraPapelTieraFactory : elementos) {
			
			if(piedraPapelTieraFactory.isMe(instanciaPiedraPapelTijera)) {
				
				return piedraPapelTieraFactory;
				
			}
			 	
		}
		
		return null;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDescripcionResultado() {
		return descripcionResultado;
	}
	
	
	
}
