package es.inetum.practica0.modelo;

import java.util.List;

public abstract class PiedraPapelTijeraFactory {

	final int PIEDRA = 1;
	
	final int PAPEL = 2;
	
	final int TIJERA = 3;
	
	protected String descripcionResultado;
	
	private List<PiedraPapelTijeraFactory> elementos;
	
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
