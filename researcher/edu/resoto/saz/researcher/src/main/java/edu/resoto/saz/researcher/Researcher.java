package edu.resoto.saz.researcher;

import de.fhdo.lemma.msa.services.LemmaMicroservice;
import de.fhdo.lemma.msa.services.LemmaMicroserviceType;
import edu.resoto.saz.researcher.gen.ResearcherGen;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@LemmaMicroservice(type = LemmaMicroserviceType.FUNCTIONAL)
@SpringBootApplication(scanBasePackages = "edu.resoto.saz.researcher")
public class Researcher implements ResearcherGen {

    public static void main(String[] args) {
        SpringApplication.run(Researcher.class, args);
    }
}
