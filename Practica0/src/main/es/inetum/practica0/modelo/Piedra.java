package main.es.inetum.practica0.modelo;

public class Piedra extends PiedraPapelTijeraFactory{

	public Piedra() {
		this("Piedra", PiedraPapelTijeraFactory.PIEDRA);
	}
	
	public Piedra(String nombre, int numero) {
		super(nombre, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isMe(int numero) {
		return numero == PiedraPapelTijeraFactory.PIEDRA;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory piedraPapelTijeraFactory) {
		
		int resul=0;
		switch (piedraPapelTijeraFactory.getNumero()) {
			
			case TIJERA:
				resul = 1;
				this.descripcionResultado = "Piedra le gana a " + piedraPapelTijeraFactory.getNombre();
				break;
				
	        case PAPEL:
				resul = -1;
				this.descripcionResultado = "Piedra pierdió con " + piedraPapelTijeraFactory.getNombre();
				break;
	
			default:
				resul = 0;
				this.descripcionResultado = "Piedra empata con " + piedraPapelTijeraFactory.getNombre();
				break;
			}
		return resul;
	}

}
