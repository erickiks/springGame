package com.senai.erick.PrjGame.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.erick.PrjGame.Services.JogoService;
import com.senai.erick.PrjGame.Entities.Jogo;


@RestController
@RequestMapping("/jogos")
public class JogoController {

	@GetMapping("/home")
    public String paginaInicial() {
        return "index";
    }
	private final JogoService jogoservice;
	
	@Autowired
	public JogoController(JogoService jogoservice) {
		this.jogoservice = jogoservice;		
	}
	@GetMapping("/{id}")	
    public ResponseEntity<Jogo> getJogo(@PathVariable Long id) {
        Jogo jogo = jogoservice.getJogoById(id);
        if (jogo != null) {
            return ResponseEntity.ok(jogo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }	
	@PostMapping
	public Jogo createJogo(@RequestBody Jogo jogo) {
		return jogoservice.saveJogo(jogo);
	}
	
	@GetMapping
	public List<Jogo> getAllJogos(){
		return jogoservice.getAllJogos();
	}
	
	@DeleteMapping("/{id}")
	public void deleteJogo(@PathVariable Long id) {
		jogoservice.deletejogo(id);
	}
	
	
	

}
