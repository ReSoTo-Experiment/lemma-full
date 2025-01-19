package edu.resoto.saz.Survey.managers;

import edu.resoto.saz.Survey.domain.Tenant.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublishManager {

    private final SurveyRepository surveyRepo;

    @Autowired
    public PublishManager(SurveyRepository surveyRepo){
        this.surveyRepo = surveyRepo;
    }
}
