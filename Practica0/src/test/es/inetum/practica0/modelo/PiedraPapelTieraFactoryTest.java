package test.es.inetum.practica0.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.es.inetum.practica0.modelo.Papel;
import main.es.inetum.practica0.modelo.Piedra;
import main.es.inetum.practica0.modelo.PiedraPapelTijeraFactory;
import main.es.inetum.practica0.modelo.Tijera;

public class PiedraPapelTieraFactoryTest {

	//GIVEN
	PiedraPapelTijeraFactory piedra, papel, tijera;
	
	//WHEN
	@BeforeEach
	void setUp() {
		
		piedra = new Piedra();
		papel = new Papel();
		tijera = new Tijera();
	}
	
//	@AfterEach
	void tearDown() {
		
		piedra = null;
		papel = null;
		tijera = null;
	}
	
	
	@Test
	void testGetInstance() {
		
		//THEN
		assertEquals("Piedra", PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.PIEDRA).getNombre());
		assertEquals("Papel", PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.PAPEL).getNombre());
		assertEquals("Tijera", PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.TIJERA).getNombre());
	}
	
	@Test
	void testCompararTijera() {
		
		//THEN
		assertEquals(1, tijera.comparar(papel));
		assertEquals(-1, tijera.comparar(piedra));
		assertEquals(0, tijera.comparar(tijera));
		
	}
	
	@Test
	void testCompararPiedra() {
		
		//THEN
		assertEquals(1, piedra.comparar(tijera));
		assertEquals(-1, piedra.comparar(papel));
		assertEquals(0, piedra.comparar(piedra));
		
	}
	
	@Test
	void testCompararPapel() {
		
		//THEN
		assertEquals(1, papel.comparar(piedra));
		assertEquals(-1, papel.comparar(tijera));
		assertEquals(0, papel.comparar(papel));
		
	}
}
