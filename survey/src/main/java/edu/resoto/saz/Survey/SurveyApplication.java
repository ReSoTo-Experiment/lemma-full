package edu.resoto.saz.Survey;

import de.fhdo.lemma.msa.services.LemmaMicroservice;
import de.fhdo.lemma.msa.services.LemmaMicroserviceType;
import edu.resoto.saz.Survey.domain.Tenant.SurveyRepository;
import edu.resoto.saz.Survey.domain.Tenant.Survey;
import edu.resoto.saz.Survey.gen.SurveyGen;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.UUID;

@LemmaMicroservice(type = LemmaMicroserviceType.FUNCTIONAL)
@SpringBootApplication(scanBasePackages = "edu.resoto.saz.Survey")
@EnableJpaRepositories(basePackages = "edu.resoto.saz.Survey.domain.Tenant")
public class SurveyApplication implements SurveyGen {

    public static void main(String[] args) {
        SpringApplication.run(SurveyApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(SurveyRepository repository) {
        return args -> {
            repository.save(new Survey( UUID.randomUUID().toString(), "surveyModel"));
        };
    }
}
