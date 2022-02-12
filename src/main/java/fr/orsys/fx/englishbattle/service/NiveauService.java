package fr.orsys.fx.englishbattle.service;

import java.util.List;

import fr.orsys.fx.englishbattle.business.Niveau;

public interface NiveauService {

	List<Niveau> recupererNiveaux();

	Niveau recupererNiveau(Long idNiveau);

}
