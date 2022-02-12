package fr.orsys.fx.englishbattle.service;

import fr.orsys.fx.englishbattle.business.Joueur;
import fr.orsys.fx.englishbattle.business.Partie;
import fr.orsys.fx.englishbattle.business.Verbe;

public interface PartieService {

	Partie ajouterPartie(Joueur joueur);

	boolean estPresent(Partie partie, Verbe verbe);

}
