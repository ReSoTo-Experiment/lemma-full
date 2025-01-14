package edu.resoto.saz.Admin;

import de.fhdo.lemma.msa.services.LemmaMicroservice;
import de.fhdo.lemma.msa.services.LemmaMicroserviceType;
import edu.resoto.saz.Admin.gen.AdminGen;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@LemmaMicroservice(type = LemmaMicroserviceType.FUNCTIONAL)
@SpringBootApplication(scanBasePackages = "edu.resoto.saz.Admin")
public class Admin implements AdminGen {

    public static void main(String[] args) {
        SpringApplication.run(Admin.class, args);
    }
}
