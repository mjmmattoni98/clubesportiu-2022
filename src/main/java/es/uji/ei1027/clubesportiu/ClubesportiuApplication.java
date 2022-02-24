package es.uji.ei1027.clubesportiu;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.logging.Logger;

@SpringBootApplication
public class ClubesportiuApplication {

	private static final Logger log = Logger.getLogger(ClubesportiuApplication .class.getName());

	public static void main(String[] args) {
		// Auto-configura l'aplicació
		new SpringApplicationBuilder(ClubesportiuApplication.class).run(args);
	}

}

