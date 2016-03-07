package lt.personal.psk.components;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateful;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

@Named
//@RequestScoped 
@SessionScoped
@Stateful
public class Komponentas2 {

	@PostConstruct
	public void init() {
		System.out.println(toString() + " constructed component 2.");
	}

	@PreDestroy
	public void aboutToDie() {
		System.out.println(toString() + " ready to die comp 2.");
	}
}