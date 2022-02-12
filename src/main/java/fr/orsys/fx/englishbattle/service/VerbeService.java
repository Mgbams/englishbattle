package fr.orsys.fx.englishbattle.service;

import java.util.List;

import fr.orsys.fx.englishbattle.business.Partie;
import fr.orsys.fx.englishbattle.business.Question;
import fr.orsys.fx.englishbattle.business.Verbe;
import fr.orsys.fx.englishbattle.exceptions.AucunVerbeException;

public interface VerbeService {

	Verbe ajouterVerbe(String baseVerbale, String preterit, String participePasse, String traduction);

	Verbe recupererVerbeAleatoire();

	Verbe recupererVerbeAleatoire(Partie partie) throws AucunVerbeException;

	boolean verifierReponse(Question question);

	Verbe recupererVerbe(String baseVerbale);

	List<Verbe> recupererVerbes();

	Verbe recupererVerbeParId(Long idVerbe);

	int getNbVerbes();

	Verbe modifierVerbe(Long idVerbe, String baseVerbale, String preterit, String participePasse,
			String traduction);
}
