package fr.orsys.fx.englishbattle.service.impl;

import java.util.ArrayList;
import java.util.List;

import fr.orsys.fx.englishbattle.business.Partie;
import fr.orsys.fx.englishbattle.business.Question;
import fr.orsys.fx.englishbattle.business.Verbe;
import fr.orsys.fx.englishbattle.service.QuestionService;

public class QuestionServiceImpl implements QuestionService {

	public static List<Question> questions = new ArrayList<>();

	@Override
	public Question ajouterQuestion(Partie partie, Verbe verbe) {
		Question question = new Question(partie, verbe);
		partie.addQuestion(question);
		return question;
	}

}
