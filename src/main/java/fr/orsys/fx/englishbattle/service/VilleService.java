package fr.orsys.fx.englishbattle.service;

import java.util.List;

import fr.orsys.fx.englishbattle.business.Ville;

public interface VilleService {

	List<Ville> recupererVilles();

	Ville recupererVilleParId(Long idVille);
}
