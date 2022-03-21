package es.uji.ei1027.clubesportiu.controller;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import es.uji.ei1027.clubesportiu.model.Nadador;

import java.util.Arrays;
import java.util.List;

public class NadadorValidator implements Validator {
    @Override
    public boolean supports(Class<?> cls) {
        return Nadador.class.equals(cls);
        // o, si volguérem tractar també les subclasses:
        // return Nadador.class.isAssignableFrom(cls);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        Nadador nadador = (Nadador) obj;
        if (nadador.getNom().trim().equals(""))
            errors.rejectValue("nom", "obligatori",
                    "Cal introduir un valor");
        if(nadador.getEdat() <= 15)
            errors.rejectValue("edat", "edad mínima", "La edad debe ser mayor de 15 años");
        List<String> valors = Arrays.asList("Femeni", "Masculi");
        if (!valors.contains(nadador.getGenere()))
            errors.rejectValue("genere", "valor incorrecte",
                    "Deu ser: Femeni o Masculi");
    }
}
