package es.inetum.juego.modelo;

public class Papel extends PiedraPapelTijeraFactory{

	public Papel() {
		this("Papel", PiedraPapelTijeraFactory.PAPEL);
	}
	
	public Papel(String nombre, int numero) {
		super(nombre, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isMe(int numeroPiedraPapelTijera) {
		return numeroPiedraPapelTijera == PiedraPapelTijeraFactory.PAPEL;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory piedraPapelTijeraFactory) {
		
		int resul=0;
		switch (piedraPapelTijeraFactory.getNumero()) {
		
			case PIEDRA:
				resul = 1;
				this.descripcionResultado = "Papel le gana a " + piedraPapelTijeraFactory.getNombre();
				break;
				
	        case TIJERA:
				resul = -1;
				this.descripcionResultado = "Papel pierdió con " + piedraPapelTijeraFactory.getNombre();
				break;
	
			default:
				resul = 0;
				this.descripcionResultado = "Papel empata con " + piedraPapelTijeraFactory.getNombre();
				break;
			}
		return resul;
	

	}

}
