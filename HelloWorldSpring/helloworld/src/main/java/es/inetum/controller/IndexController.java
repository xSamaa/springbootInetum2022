package es.inetum.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import main.es.inetum.practica0.modelo.PiedraPapelTijeraFactory;

@Controller
public class IndexController {
	
	@RequestMapping("/home")
	public String goIndex() {
		return "index";
	}
	
	@RequestMapping("/")
	public String goPresentacion() {
		return "presentacion";
	}
	
	@RequestMapping("/listado")
	public String goListado(Model model) {
		
		List<String> alumnos = new ArrayList<String>();
		
		alumnos.add("Gabriel");
		alumnos.add("Julio");
		alumnos.add("Toni");
		
		model.addAttribute("titulo", "Listado de alumnos");
		model.addAttribute("profesor", "Gabriel Casas");
		model.addAttribute("alumnos", alumnos);
		
		return "listado";
	}
	
	@RequestMapping("/juego/{nombre}")
	public String goJuego(@PathVariable("nombre") String nombre, Model model) {
		
		List<PiedraPapelTijeraFactory> eleccion = new ArrayList<PiedraPapelTijeraFactory>();
		
		eleccion.add(PiedraPapelTijeraFactory.getInstance(1));
		eleccion.add(PiedraPapelTijeraFactory.getInstance(2));
		eleccion.add(PiedraPapelTijeraFactory.getInstance(3));
		
		model.addAttribute("opciones", eleccion);
		
		return "juego";
	}
	
	@RequestMapping("/resultado")
	public String goResultado(@RequestParam String selPPT, Model model) {
				
		System.out.println("SELECCIONADA");
		System.out.println(selPPT);
		
		PiedraPapelTijeraFactory pptPlayer = PiedraPapelTijeraFactory.getInstance(Integer.parseInt(selPPT));
		PiedraPapelTijeraFactory pptPC = PiedraPapelTijeraFactory.getInstance((int)(Math.random()*100%3+1));
		
		pptPlayer.comparar(pptPC);
		
		model.addAttribute("pptPlayer", pptPlayer);
		model.addAttribute("pptPC", pptPC);
		
		return "resultado";
	}
	

}
