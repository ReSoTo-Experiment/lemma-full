package edu.resoto.saz.Survey.managers;

import edu.resoto.saz.Survey.domain.Tenant.Survey;
import edu.resoto.saz.Survey.domain.Tenant.gen.SurveyRepositoryGen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This class is used to manage surveys and the operations to manipulated the
 * survey data set.
 */
@Service
public class SurveyManager {

    private final SurveyRepositoryGen surveyRepo;

    @Autowired
    public SurveyManager(SurveyRepositoryGen surveyRepo){
        this.surveyRepo = surveyRepo;
    }

    public Survey getSurvey(String guid){
        return surveyRepo.findByGuid(guid);
    }
}
