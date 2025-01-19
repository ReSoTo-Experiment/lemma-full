package edu.resoto.saz.researcher.managers;

import edu.resoto.saz.researcher.domain.Tenant.Survey;
import edu.resoto.saz.researcher.domain.Tenant.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ResearchManager {

    private final SurveyRepository surveyRepo;

    @Value("${surveyService.url}")
    private String surveyServiceUrl;

    private final WebClient serviceClient;

    @Autowired
    public ResearchManager(SurveyRepository surveyRepo){
        this.surveyRepo = surveyRepo;
        this.serviceClient = createWebClient();
    }

    public Survey getSurvey(String guid){
        return serviceClient.get()
                .uri("/{guid}", guid)
                .retrieve()
                .bodyToMono(Survey.class)
                .block();
    }

    public boolean createSurvey(Survey survey){
        return Boolean.TRUE.equals(serviceClient.post()
                .uri("/")
                .bodyValue(survey)
                .retrieve()
                .bodyToMono(Boolean.class)
                .block());
    }

    public boolean updateSurvey(Survey survey){
        return Boolean.TRUE.equals(serviceClient.put()
                .uri("/")
                .bodyValue(survey)
                .retrieve()
                .bodyToMono(Boolean.class)
                .block());
    }

    private WebClient createWebClient() {
        return WebClient.create(surveyServiceUrl);
    }
}
