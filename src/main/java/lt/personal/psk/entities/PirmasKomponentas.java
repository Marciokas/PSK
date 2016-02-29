package lt.personal.psk.entities;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateful;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
// @RequestScoped
@SessionScoped
@Stateful
public class PirmasKomponentas {

	@Inject
	private Komponentas2 antras;
	private String text = "stuff";

	public void doStuff() {
		text =  antras.getClass().getName();
		System.out.println(antras.getClass().getName() + " *******");
	}

	@PostConstruct
	public void init() {
		System.out.println(toString() + " constructed.");
	}

	@PreDestroy
	public void aboutToDie() {
		System.out.println(toString() + " ready to die.");
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}