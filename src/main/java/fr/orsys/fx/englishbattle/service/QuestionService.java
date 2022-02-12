package fr.orsys.fx.englishbattle.service;

import fr.orsys.fx.englishbattle.business.Partie;
import fr.orsys.fx.englishbattle.business.Question;
import fr.orsys.fx.englishbattle.business.Verbe;

public interface QuestionService {

	Question ajouterQuestion(Partie partie, Verbe verbe);
}
