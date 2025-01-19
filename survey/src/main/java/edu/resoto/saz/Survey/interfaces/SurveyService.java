package edu.resoto.saz.Survey.interfaces;

import edu.resoto.saz.Survey.domain.Tenant.Survey;
import edu.resoto.saz.Survey.domain.Tenant.SurveyRepository;
import edu.resoto.saz.Survey.interfaces.gen.SurveyServiceGen;
import edu.resoto.saz.Survey.managers.SurveyManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Component()
@RestController()
public class SurveyService implements SurveyServiceGen {

    private final SurveyManager surveyRepo;
    private final SurveyManager surveyManager;

    @Autowired
    public SurveyService(SurveyManager surveyRepo, SurveyManager surveyManager) {
        this.surveyRepo = surveyRepo;
        this.surveyManager = surveyManager;
    }

    @GetMapping(value = "/survey/{surveyGuid}")
    protected Survey getSurvey(@PathVariable() String surveyGuid) {
        checkRequiredParametersOfGetSurvey(surveyGuid);

        if(surveyRepo!= null){
            return surveyRepo.getSurvey(surveyGuid);
        }
        throw new IllegalStateException("The surveyRepo is not initialized");
    }

    private void checkRequiredParametersOfGetSurvey(String surveyGuid) {
        if (surveyGuid == null)
            throw new IllegalArgumentException("Required parameter \"surveyGuid\" must not be null");
    }

    /**
     * Store a new survey in the database.
     *
     * @param survey The survey to store
     * @return
     */
    @PostMapping(value = "/survey")
    protected Boolean createSurvey(@RequestBody() Survey survey) {
        checkRequiredParametersOfCreateSurvey(survey);
        if(surveyRepo!= null){
            surveyManager.saveSurvey(survey);
            return true;
        }
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void checkRequiredParametersOfCreateSurvey(Survey survey) {
        if (surveyManager.checkSurveySanity(survey))
            throw new IllegalArgumentException("Required parameter \"survey\" must not be null");
    }

    /**
     * Update an existing survey in the database.
     *
     * @param survey The survey to update
     * @return True if the survey was updated successfully, false otherwise
     */
    @PutMapping(value = "/survey")
    protected Boolean updateSurvey(@RequestBody() Survey survey) {
        checkRequiredParametersOfUpdateSurvey(survey);

        if(surveyManager != null){
            return surveyManager.saveSurvey(survey);
        }

        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void checkRequiredParametersOfUpdateSurvey(Survey survey) {
        if (surveyManager.checkSurveySanity(survey))
            throw new IllegalArgumentException("Required parameter \"survey\" must not be null");
    }


    /**
     * Delete a survey from the database.
     *
     * @param surveyGuid The GUID of the survey to delete
     */
    @DeleteMapping(value = "/survey/{surveyGuid}")
    protected void deleteSurvey(@PathVariable() String surveyGuid) {
        checkRequiredParametersOfDeleteSurvey(surveyGuid);

        surveyManager.deleteSurvey(surveyGuid);
    }

    private void checkRequiredParametersOfDeleteSurvey(String surveyGuid) {
        if (surveyGuid == null)
            throw new IllegalArgumentException("Required parameter \"surveyGuid\" must not be null");
    }
}
