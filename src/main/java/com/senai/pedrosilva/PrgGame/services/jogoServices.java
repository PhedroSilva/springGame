package com.senai.pedrosilva.PrgGame.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.senai.pedrosilva.PrgGame.entities.*;

import com.senai.pedrosilva.PrgGame.Repositories.*;


@Service
public class jogoServices {
	private final jogoRepository jogoRepository;
	
	@Autowired
	public jogoServices (jogoRepository jogoRepository) {
		this.jogoRepository = jogoRepository;
	}
	
	public jogo saveJogo(jogo jogo) {
		return jogoRepository.save(jogo);
	}
	
	public List<jogo> getAllJogo(){
		return jogoRepository.findAll();
	}
	
	public jogo getJogoById(Long id) {
		return jogoRepository.findById(id).orElse(null);
	}
	
	public void deleteJogo(Long id) {
		jogoRepository.deleteById(id);
	}
}
	