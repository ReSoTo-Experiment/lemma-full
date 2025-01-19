package edu.resoto.saz.Survey.managers;

import edu.resoto.saz.Survey.domain.Tenant.Survey;
import edu.resoto.saz.Survey.domain.Tenant.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This class is used to manage surveys and the operations to manipulated the
 * survey data set.
 */
@Service
public class SurveyManager {

    private final SurveyRepository surveyRepo;

    @Autowired
    public SurveyManager(SurveyRepository surveyRepo){
        this.surveyRepo = surveyRepo;
    }

    public Survey getSurvey(String guid){

        return surveyRepo.findByGuid(guid);
    }

    /**
     * Createa and save a new survey
     * @param survey
     * @return
     */
    public boolean saveSurvey(Survey survey){
        if (!checkSurveySanity(survey)){
            throw new IllegalArgumentException("Survey is not valid");
        }

        surveyRepo.save(survey);
        return true;
    }

    /**
     * If a survey exists with the guid, then delete it.
     * @param guid
     * @return
     */
    public boolean deleteSurvey(String guid){
        Survey survey = surveyRepo.findByGuid(guid);
        if (survey == null){
            throw new IllegalArgumentException("Survey not found");
        }
        surveyRepo.delete(survey);
        return true;
    }

    public boolean checkSurveySanity(Survey survey){
        return survey != null && survey.getGuid() != null && survey.getSurveyModel() != null;
    }
}
