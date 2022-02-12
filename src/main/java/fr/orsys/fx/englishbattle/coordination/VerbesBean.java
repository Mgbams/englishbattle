package fr.orsys.fx.englishbattle.coordination;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import fr.orsys.fx.englishbattle.business.Verbe;
import fr.orsys.fx.englishbattle.service.VerbeService;
import fr.orsys.fx.englishbattle.service.impl.VerbeServiceImpl;

@ManagedBean(name = "verbesBean")
@RequestScoped
public class VerbesBean implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private VerbeService verbeService = new VerbeServiceImpl();
	private Verbe verbe;
	
	@PostConstruct
	public void init() {
		System.out.println("PostConstruct");
		verbe = new Verbe();
	}
	
	public Verbe getVerbe() {
		return this.verbe;
	}
	
	public List<Verbe> getVerbes() {
		List<Verbe> verbes = verbeService.recupererVerbes();
		return verbes;
	}
}
