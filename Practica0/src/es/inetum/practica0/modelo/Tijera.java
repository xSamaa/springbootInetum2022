package es.inetum.practica0.modelo;

public class Tijera extends PiedraPapelTijeraFactory{

	public Tijera() {
		this("Tijera", PiedraPapelTijeraFactory.TIJERA);
	}
	
	public Tijera(String nombre, int numero) {
		super(nombre, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isMe(int numeroPiedraPapelTijera) {
		return numeroPiedraPapelTijera == PiedraPapelTijeraFactory.TIJERA;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory piedraPapelTijeraFactory) {
		
		int resul=0;
		switch (piedraPapelTijeraFactory.getNumero()) {
		
			case PAPEL:
				resul=1;
				this.descripcionResultado = "Tijera le gana a " + piedraPapelTijeraFactory.getNombre();
				break;
				
	        case PIEDRA:
				resul=-1;
				this.descripcionResultado = "Tijera pierdió con " + piedraPapelTijeraFactory.getNombre();
				break;
	
			default:
				resul=0;
				this.descripcionResultado = "Tijera empata con " + piedraPapelTijeraFactory.getNombre();
				break;
			}
		return resul;
	}

}
