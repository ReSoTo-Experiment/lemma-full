package edu.resoto.saz.Survey.interfaces;

import edu.resoto.saz.Survey.domain.Tenant.Survey;
import edu.resoto.saz.Survey.interfaces.gen.SurveyServiceGen;
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

    @GetMapping(value = "/survey/{surveyGuid}")
    protected Survey getSurvey(@PathVariable() String surveyGuid) {
        checkRequiredParametersOfGetSurvey(surveyGuid);
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void checkRequiredParametersOfGetSurvey(String surveyGuid) {
        if (surveyGuid == null)
            throw new IllegalArgumentException("Required parameter \"surveyGuid\" must not be null");
    }

    @PostMapping(value = "/survey")
    protected Boolean createSurvey(@RequestBody() Survey user) {
        checkRequiredParametersOfCreateSurvey(user);
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void checkRequiredParametersOfCreateSurvey(Survey user) {
        if (user == null)
            throw new IllegalArgumentException("Required parameter \"user\" must not be null");
    }

    @PutMapping(value = "/survey")
    protected Boolean updateSurvey(@RequestBody() Survey user) {
        checkRequiredParametersOfUpdateSurvey(user);
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void checkRequiredParametersOfUpdateSurvey(Survey user) {
        if (user == null)
            throw new IllegalArgumentException("Required parameter \"user\" must not be null");
    }

    @DeleteMapping(value = "/survey/{surveyGuid}")
    protected void deleteSurvey(@PathVariable() String surveyGuid) {
        checkRequiredParametersOfDeleteSurvey(surveyGuid);
    }

    private void checkRequiredParametersOfDeleteSurvey(String surveyGuid) {
        if (surveyGuid == null)
            throw new IllegalArgumentException("Required parameter \"surveyGuid\" must not be null");
    }
}
