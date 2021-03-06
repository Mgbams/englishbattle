package fr.orsys.fx.englishbattle.service;

import java.util.List;

import fr.orsys.fx.englishbattle.business.Message;

public interface MessageService {

	Message ajouterMessage(Long idJoueurExpediteur, Long idJoueurDestinataire, String objet, String corps);
	
	List<Message> recupererMessages(Long idJoueurDestinataire);

}
